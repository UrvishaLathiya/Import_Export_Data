package com.example.Import_Export_Data.repository.destination;
import com.example.Import_Export_Data.entity.AccountProductionMasterTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinationAccountProductionMasterTableRepository extends JpaRepository<AccountProductionMasterTable, Integer> {
    List<AccountProductionMasterTable> findAllByMasterChartOfAccountId(int masterChartOfAccountId);
}
