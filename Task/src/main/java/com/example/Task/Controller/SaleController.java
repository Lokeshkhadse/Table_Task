//package com.example.Task.Controller;
//
//import com.example.Task.Entity.Sale;
//import com.example.Task.Service.SaleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping
//public class SaleController {
//
//    @Autowired
//    private SaleService saleService;
//
//    @PostMapping("/addsales")
//    public ResponseEntity<Sale>addsale(@RequestBody Sale sale){
//        return new ResponseEntity<>(saleService.createsale(sale), HttpStatus.CREATED);
//    }
//}
