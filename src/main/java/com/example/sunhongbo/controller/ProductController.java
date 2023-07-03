package com.example.sunhongbo.controller;

import com.example.sunhongbo.entity.Product;
import com.example.sunhongbo.entity.Result;
import com.example.sunhongbo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/index")
    public Result getAllProduct(){
        return productService.getAllproduct();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @PostMapping("/xgcx")
    public Result xgcx(@RequestBody String productId){
        int productId1 = Integer.parseInt(productId);
        return productService.getOneProductById(productId1);
    }

    @PostMapping("/xg")
    public Result xg(@RequestBody Product product){
        System.out.println("-------------------------");
        return productService.updateProduct(product);
    }

    @PostMapping("/sc")
    public Result sc(@RequestBody String productId){
        int productId1 = Integer.parseInt(productId);
        return productService.deleteProduct(productId1);
    }
}
