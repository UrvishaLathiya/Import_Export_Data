package com.example.Import_Export_Data.repository.destination;

import com.example.Import_Export_Data.entity.AccountProductionSubSections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinationAccountProductionSubSectionsRepository extends JpaRepository<AccountProductionSubSections, Integer> {
    List<AccountProductionSubSections> findByMasterChartOfAccountId(int masterChartOfAccountId);

}
