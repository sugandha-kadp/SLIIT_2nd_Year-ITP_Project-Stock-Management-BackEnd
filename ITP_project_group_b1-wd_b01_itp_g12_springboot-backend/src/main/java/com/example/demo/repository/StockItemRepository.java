package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StockItem;

@Repository
public interface StockItemRepository extends JpaRepository<StockItem, Long>{

}
