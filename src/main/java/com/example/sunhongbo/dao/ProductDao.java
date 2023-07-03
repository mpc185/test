package com.example.sunhongbo.dao;

import com.example.sunhongbo.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductDao {
    // 查询所有商品信息
    @Select("select * from product")
    List<Product> getAllProduct();
    // 通过商品名称查询商品信息
    @Select("select * from product where productName=#{productName}")
    Product getProductByName(String productName);
    // 插入新商品
    @Insert("insert into product(productName, productStock) values (#{productName},#{productStock})")
    void insertOneProduct(String productName,int productStock);
    // 通过id查询商品
    @Select("select * from product where productId=#{productId}")
    Product getProductById(int productId);
    // 更改商品名称和库存
    @Update("update product set productName=#{productName},productStock=#{productStock} where productId=#{productId}")
    void updateProduct(int productId,String productName,int productStock);
    // 删除
    @Delete("delete from product where productId=#{productId}")
    void deleteproduct(int productId);
}
