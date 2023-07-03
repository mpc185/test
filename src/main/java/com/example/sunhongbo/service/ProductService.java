package com.example.sunhongbo.service;

import com.example.sunhongbo.dao.ProductDao;
import com.example.sunhongbo.entity.Product;
import com.example.sunhongbo.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;
    @Autowired
    Result result;


    public Result getAllproduct(){
        List<Product> productList = new ArrayList<>();
        productList = productDao.getAllProduct();
        result.success(productList);
        return result;
    }

    public Result addProduct(Product product){
        Product product1 = productDao.getProductByName(product.getProductName());
        if (product1 != null){
            result.error("hadInfo");
            return result;
        }
        productDao.insertOneProduct(product.getProductName(),product.getProductStock());
        result.success(null);
        return result;
    }
    public Result getOneProductById(int productId){
        Product product = productDao.getProductById(productId);
        result.success(product);
        return result;
    }

    public Result updateProduct(Product product){
        Product product1 = productDao.getProductById(product.getProductId());
        if(product1.getProductStock()== product.getProductStock()&&product1.getProductName().equals(product.getProductName())){
            result.error("noxg");
            return result;
        }
        productDao.updateProduct(product.getProductId(), product.getProductName(), product.getProductStock());
        result.success(null);
        return result;
    }

    public Result deleteProduct(int productId){
        productDao.deleteproduct(productId);
        result.success(null);
        return result;
    }

}
