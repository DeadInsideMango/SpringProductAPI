package com.example.SpringProductAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpringProductAPI.Model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {}
