//package com.example.Task.Controller;
//
//import com.example.Task.Entity.Product;
//import com.example.Task.Service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
//
//    @PostMapping("/addproduct")
//        public ResponseEntity<Product>createProduct(@RequestBody Product product){
//            return new ResponseEntity<>(productService.createproduct(product), HttpStatus.CREATED);
//
//
//        }
//
//        @GetMapping("/allproduct")
//        public ResponseEntity<List<Product>>getallproduct(){
//        return new ResponseEntity<>(productService.getallProducts(),HttpStatus.FOUND);
//        }
//    }
//
