package com.example.Task.Repository;

import com.example.Task.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product , Long> {
}
