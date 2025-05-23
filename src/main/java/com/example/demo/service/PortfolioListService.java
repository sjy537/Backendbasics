package com.example.demo.service;

import com.example.demo.dto.PortfolioListOutput;
import com.example.demo.entity.PortfolioList;
import com.example.demo.mapper.PortfolioListMapper;
import com.example.demo.repository.PortfolioListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PortfolioListService {

    @Autowired
    private PortfolioListRepository repository;

    public List<PortfolioListOutput> getPortfolioLists(String ownerId) {
        return repository.findByOwnerId(ownerId)
                .stream()
                .map(PortfolioListMapper::toOutput)
                .collect(Collectors.toList());
    }

}
