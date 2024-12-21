package com.example.collect_user_data.controller;

import com.example.collect_user_data.entity.ReportsEntity;
import com.example.collect_user_data.service.ReportsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
@RequiredArgsConstructor
public class ReportsController {

    @Autowired
    private final ReportsService reportsService;

    @PostMapping
    public ReportsEntity saveNewReport(@RequestBody ReportsEntity reportEntity) {
        return reportsService.saveNewReport(reportEntity);
    }
}
