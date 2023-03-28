package com.appsdeveloperblog.app.ws.mobileappws.Product;

import com.appsdeveloperblog.app.ws.mobileappws.Admin.Admin;
import com.appsdeveloperblog.app.ws.mobileappws.user.User;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
public class Product{
    @Id
    private String productId;
    private ProductCategory productCategory;
    private String productName;
    private BigDecimal productPrice;
    private String productDescription;
    private BigDecimal availableProductQuantity;
    private double productWeight;
    private String productImage;

    @DBRef
    Admin admin;

    public Product(Admin admin){
        this.admin=admin;
    }

    public Product(ProductCategory productCategory,
                   String productName,BigDecimal productPrice,String productDescription,
                   BigDecimal availableProductQuantity,double productWeight){
        this.productName=productName;
        this.productCategory=productCategory;
        this.productPrice=productPrice;
        this.productDescription=productDescription;
        this.availableProductQuantity=availableProductQuantity;
        this.productWeight=productWeight;

    }
}
