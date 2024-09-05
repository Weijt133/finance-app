package com.assessment.YOUx.controller;

import com.assessment.YOUx.model.FinanceApplication;
import com.assessment.YOUx.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/applications")
public class FinanceApplicationController {

    @Autowired
    private FinanceService service;

    @GetMapping
    public List<FinanceApplication> getAllApplications() {
        return service.getAllApplications();
    }

    @GetMapping("/{id}")
    public FinanceApplication getApplicationById(@PathVariable String id) {
        return service.getApplicationById(id);
    }

    @PostMapping
    public FinanceApplication createApplication(@RequestBody FinanceApplication application) {
        return service.saveApplication(application);
    }

    @PutMapping("/{id}")
    public FinanceApplication updateApplication(@PathVariable String id, @RequestBody FinanceApplication application) {
        application.setId(id);
        return service.saveApplication(application);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable String id) {
        service.deleteApplication(id);
    }
}
