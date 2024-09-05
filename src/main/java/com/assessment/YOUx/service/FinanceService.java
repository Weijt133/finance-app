package com.assessment.YOUx.service;

import com.assessment.YOUx.model.FinanceApplication;
import com.assessment.YOUx.repository.FinanceApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FinanceService {
    @Autowired
    private FinanceApplicationRepository repository;

    public List<FinanceApplication> getAllApplications() {
        return repository.findAll();
    }

    public FinanceApplication getApplicationById(String id) {
        return repository.findById(id).orElse(null);
    }

    public FinanceApplication saveApplication(FinanceApplication application) {
        return repository.save(application);
    }

    public void deleteApplication(String id) {
        repository.deleteById(id);
    }
}
