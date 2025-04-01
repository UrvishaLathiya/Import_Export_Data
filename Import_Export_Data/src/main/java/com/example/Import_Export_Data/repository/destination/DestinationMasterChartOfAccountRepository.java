package com.example.Import_Export_Data.repository.destination;

import com.example.Import_Export_Data.entity.MasterChartOfAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationMasterChartOfAccountRepository extends JpaRepository<MasterChartOfAccount, Integer> {

}
