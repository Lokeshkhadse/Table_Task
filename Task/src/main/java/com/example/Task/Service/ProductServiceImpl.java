//package com.example.Task.Service;
//
//import com.example.Task.Entity.Product;
//import com.example.Task.Repository.ProductRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductServiceImpl implements  ProductService{
//
//    @Autowired
//    private ProductRepo productRepo;
//
//    public Product createproduct(Product product){
//        return productRepo.save(product);
//    }
//
//    @Override
//    public List<Product> getallProducts() {
//        return productRepo.findAll();
//    }
//}
