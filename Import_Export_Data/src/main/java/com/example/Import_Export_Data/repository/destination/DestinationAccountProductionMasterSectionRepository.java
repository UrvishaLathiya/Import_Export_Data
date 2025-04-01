package com.example.Import_Export_Data.repository.destination;

import com.example.Import_Export_Data.entity.AccountProductionMasterSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinationAccountProductionMasterSectionRepository extends JpaRepository<AccountProductionMasterSection, Integer> {

    List<AccountProductionMasterSection> findAllByApVersion(int apVersion);
}

