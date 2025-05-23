package com.example.demo.repository;

import com.example.demo.entity.PortfolioList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortfolioListRepository extends JpaRepository<PortfolioList, Long> {
    List<PortfolioList> findByOwnerId(String ownerId);
}
