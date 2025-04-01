package com.example.Import_Export_Data.controller;

import com.example.Import_Export_Data.service.DataTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/transfer")
public class DataTransferController {

    @Autowired
    private DataTransferService dataTransferService;


    @PostMapping("/{id}")
    public ResponseEntity<String> transferRecords(@PathVariable Integer id){
        dataTransferService.transferById(id);
        return ResponseEntity.ok("Data Transferes successfully!");
    }
}
