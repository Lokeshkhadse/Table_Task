package com.example.Task.Repository;

import com.example.Task.Entity.Sale;
import com.example.Task.Entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepo extends JpaRepository<Sale, Long> {

    List<Sale> findByStore(Store sId);
}
