//package com.example.Task.Controller;
//
//import com.example.Task.Entity.Store;
//import com.example.Task.Service.StoreService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping
//public class StoreController {
//    @Autowired
//    private StoreService storeService;
//
//    @PostMapping("/addstore")
//    public ResponseEntity<Store>createStore(@RequestBody Store store){
//        return new ResponseEntity<>(storeService.createstore(store), HttpStatus.OK);
//    }
//
//    @GetMapping("/name/{name}")
//    public ResponseEntity<Long>createStore(@PathVariable String name){
//        return new ResponseEntity<>(storeService.getStoreIdByName(name), HttpStatus.OK);
//    }
//
//}
