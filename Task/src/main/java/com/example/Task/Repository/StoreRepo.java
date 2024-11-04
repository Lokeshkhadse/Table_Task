package com.example.Task.Repository;

import com.example.Task.Entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepo extends JpaRepository<Store,Long> {
    Store findByName(String name);
}
