package com.example.demo.mapper;

import com.example.demo.dto.PortfolioListOutput;
import com.example.demo.entity.PortfolioList;

public class PortfolioListMapper {
    public static PortfolioListOutput toOutput(PortfolioList entity) {
        PortfolioListOutput output = new PortfolioListOutput();
        output.setId(entity.getId());
        output.setName(entity.getName());
        return output;
    }


}
