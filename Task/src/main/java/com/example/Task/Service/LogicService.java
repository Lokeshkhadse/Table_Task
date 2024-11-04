package com.example.Task.Service;

import com.example.Task.Dto.Dto;
import com.example.Task.Entity.Product;
import com.example.Task.Entity.Sale;
import com.example.Task.Entity.Store;
import com.example.Task.Repository.ProductRepo;
import com.example.Task.Repository.SaleRepo;
import com.example.Task.Repository.StoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogicService {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private SaleRepo saleRepo;

    @Autowired
    private StoreRepo storeRepo;

    public List<Dto> getoutput(String name) {
        List<Dto> list = new ArrayList<>();
        Store store = storeRepo.findByName(name);
        List<Product> products = productRepo.findAll();
        List<Sale> sales = saleRepo.findByStore(store);
        for (Product product : products) {
            Long quantity = 0L;
            boolean flag = false;
            for (Sale sale : sales) {
                if (product.getP_id().equals(sale.getProduct().getP_id())) {
                    quantity += sale.getSale_quantity();
                    flag = true;
                }
            }
            if (flag) {
                Dto dto = new Dto();
                dto.setProduct_name(product.getName());
                dto.setSale(quantity);
                dto.setMrp(product.getMrp());
                dto.setAmount(quantity * product.getMrp());
                list.add(dto);
            }
        }
        return list;
    }
}
