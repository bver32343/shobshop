/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Service;

import SoftwareProcess.Shobshop.Model.ProductModel;
import SoftwareProcess.Shobshop.Repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saknarong
 */
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductModel> getAllProducts() {
        List<ProductModel> allProduct = new ArrayList();
        allProduct = productRepository.findAll();
        return allProduct;
    }

    public List<ProductModel> getAllText() {
        return productRepository.findAll();
    }

    public ProductModel getById(int productId) {
        return productRepository.findByProductId(productId);
    }
    
    public List<ProductModel> searchByName(String productName){
        List<ProductModel> productBySearch = productRepository.findByProductNameContaining(productName);  
        return productBySearch; 
    }

}
