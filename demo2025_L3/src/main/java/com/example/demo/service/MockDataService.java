package com.example.demo.service;

import com.example.demo.model.Building;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MockDataService {
    void generateMockData();
    List<Building> getBuildings();
}

