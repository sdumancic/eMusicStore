package com.emusicstore.model;

/**
 * Created by Sanjin on 15.1.2017..
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.core.serializer.Serializer;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

@Entity
public class Product implements Serializable {


    private static final long serialVersionUID = -3532377236419382983L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(generator = "system-uuid")
    //@GenericGenerator(name="system-uuid", strategy = "uuid")
    private int productId;

    @NotEmpty(message="The product name must not be null.")
    private String productName;
    private String productCategory;
    private String productDescription;

    @Min(value = 0, message = "The product price must not be less then zero.")
    private double productPrice;
    private String productCondition;
    private String productStatus;

    @Min(value=0, message = "The product unit must not be less then zero.")
    private int unitInStock;
    private String productManufacturer;

    @Transient
    private MultipartFile productImage;

    /* OneToMany znaci da 1 product ima više cartItema*/
    /* mappedBy znaci da u drugoj klasi (CartItem) mora postojati polje product koja referencira ovu klasu*/
    /* CascadeType.ALL  - ako se parent obrise (parent) brisu se i sva djeca (cartItem)*/
    /* FetchType.LAZY = select se radi on demand, EAGER = demand se radi odmah*/
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<CartItem> cartItemList;

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
}
