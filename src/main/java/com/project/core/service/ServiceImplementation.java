package com.project.core.service;

import com.project.core.repository.DataRepository;

public class ServiceImplementation implements BusinessService {
    private DataRepository repository;

    public void injectRepository(DataRepository repository) {
        this.repository = repository;
    }

    @Override
    public double processCalculation() {
        return repository.retrieveData() * 3.5;
    }
}

