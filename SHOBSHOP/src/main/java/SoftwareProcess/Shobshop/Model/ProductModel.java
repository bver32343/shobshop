/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author saknarong
 */
@Entity
@Table(name = "product")
public class ProductModel {
    
    @Id
    @Column(name="ProductId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
   
    @Column(name="ProductName")
    private String productName;
    
    @Column(name="ProductDetail")
    private String productDetail;
    
    @Column(name="PictureUrl")
    private String productPicture;
    
    @Column(name="QuantityInStock")
    private int quantity;
    
    @Column(name="Category_CategoryID")
    private int category;
    
    @Column(name="Shop_ShopID")
    private int shopId;
    
    @Column(name="ProductPrice")
    private int productPrice;

    public ProductModel() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }


    
    
          
}
