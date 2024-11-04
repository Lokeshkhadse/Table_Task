//package com.example.Task.Service;
//
//import com.example.Task.Entity.Product;
//import com.example.Task.Entity.Sale;
//import com.example.Task.Entity.Store;
//import com.example.Task.Repository.ProductRepo;
//import com.example.Task.Repository.SaleRepo;
//import com.example.Task.Repository.StoreRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SaleServiceImpl implements SaleService {
//
//    @Autowired
//    private SaleRepo saleRepo;
//
//    @Autowired
//    private StoreRepo storeRepo;
//
//    @Autowired
//    private ProductRepo productRepo;
//
//    @Override
//    public Sale createsale(Sale sale) {
//        Store store = storeRepo.findById(sale.getStore().getS_id())
//                .orElseThrow(() -> new IllegalArgumentException("Invalid Store ID"));
//        Product product = productRepo.findById(sale.getProduct().getP_id())
//                .orElseThrow(() -> new IllegalArgumentException("Invalid Product ID"));
//
//        sale.setStore(store);
//        sale.setProduct(product);
//
//        return saleRepo.save(sale);
//    }
//}
