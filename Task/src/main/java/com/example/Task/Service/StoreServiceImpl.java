//package com.example.Task.Service;
//
//import com.example.Task.Entity.Store;
//import com.example.Task.Repository.StoreRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StoreServiceImpl implements StoreService {
//    @Autowired
//    private StoreRepo storeRepo;
//
//    public Store createstore(Store store){
//        return storeRepo.save(store);
//    }
//
//    public Long getStoreIdByName(String name) {
//        Store store = storeRepo.findByName(name);
//        if (store != null) {
//            return store.getS_id();
//        } else {
//            throw new IllegalArgumentException("Store with name " + name + " not found.");
//        }
//    }
//
//}
