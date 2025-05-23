package com.example.demo.controller;

import com.example.demo.dto.PortfolioListOutput;
import com.example.demo.service.PortfolioListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PortfolioListController {

    @Autowired
    private PortfolioListService service;

    @QueryMapping
    public List<PortfolioListOutput> getPortfolioLists(@Argument String ownerId) {
        return service.getPortfolioLists(ownerId);
    }
}
