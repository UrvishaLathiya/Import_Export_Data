package com.example.Import_Export_Data.service;

import com.example.Import_Export_Data.entity.AccountProductionMasterSection;
import com.example.Import_Export_Data.entity.AccountProductionSubSections;
import com.example.Import_Export_Data.entity.AccountProductionMasterTable;
import com.example.Import_Export_Data.entity.MasterChartOfAccount;
import com.example.Import_Export_Data.repository.destination.*;
import com.example.Import_Export_Data.repository.source.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataTransferService {

    @Autowired
    private SourceMasterChartOfAccountRepository sourceMasterChartOfAccountRepository;

    @Autowired
    private DestinationMasterChartOfAccountRepository destinationMasterChartOfAccountRepository;

    @Autowired
    private SourceAccountProductionMasterSectionRepository sourceSectionsRepository;

    @Autowired
    private DestinationAccountProductionMasterSectionRepository destinationSectionsRepository;

    @Autowired
    private SourceAccountProductionSubSectionsRepository sourceSubSectionRepository;

    @Autowired
    private DestinationAccountProductionSubSectionsRepository destinationSubSectionRepository;

    @Autowired
    private SourceAccountProductionMasterTableRepository sourceMasterTableRepository;

    @Autowired
    private DestinationAccountProductionMasterTableRepository destinationMasterTableRepository;

    public void transferById(int sourceId) {
        MasterChartOfAccount sourceAccount = sourceMasterChartOfAccountRepository.findById(sourceId).orElse(null);
        if (sourceAccount != null) {
            // Check if already present in destination
            MasterChartOfAccount existingAccount = destinationMasterChartOfAccountRepository.findById(sourceId).orElse(null);
            if (existingAccount == null) {
                MasterChartOfAccount destinationAccount = new MasterChartOfAccount();
                BeanUtils.copyProperties(sourceAccount, destinationAccount, "id");
                destinationAccount.setId(sourceId);
                // Handle isDeleted
                destinationAccount.setIs_deleted(false);
                destinationMasterChartOfAccountRepository.save(destinationAccount);

                // Transfer AccountProductionMasterSections
                List<AccountProductionMasterSection> sourceSections = sourceSectionsRepository.findAllByApVersion(sourceAccount.getId());
                for (AccountProductionMasterSection section : sourceSections) {
                    AccountProductionMasterSection destinationSection = new AccountProductionMasterSection();
                    BeanUtils.copyProperties(section, destinationSection, "id");
                    destinationSection.setApVersion(sourceId);
                    destinationSection.setDeleted(false);
                    destinationSectionsRepository.save(destinationSection);
                }

                // Transfer AccountProductionSubSections
                List<AccountProductionSubSections> subSections = sourceSubSectionRepository.findByMasterChartOfAccountId(sourceAccount.getId());
                for (AccountProductionSubSections subSection : subSections) {
                    AccountProductionSubSections destinationSubSection = new AccountProductionSubSections();
                    BeanUtils.copyProperties(subSection, destinationSubSection, "id");
                    destinationSubSection.setMasterChartOfAccountId(sourceId);
                    destinationSubSection.setDeleted(false);
                    destinationSubSectionRepository.save(destinationSubSection);
                }

                // Transfer AccountProductionMasterTables
                List<AccountProductionMasterTable> masterTables = sourceMasterTableRepository.findAllByMasterChartOfAccountId(sourceAccount.getId());
                for (AccountProductionMasterTable table : masterTables) {
                    AccountProductionMasterTable destinationTable = new AccountProductionMasterTable();
                    BeanUtils.copyProperties(table, destinationTable, "id");
                    destinationTable.setMasterChartOfAccountId(sourceId);
                    destinationTable.setDeleted(false);
                    destinationMasterTableRepository.save(destinationTable);
                }
            }
        }
    }
}
