/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Controller;


import SoftwareProcess.Shobshop.Model.ProductModel;
import SoftwareProcess.Shobshop.Service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 *
 * @author saknarong
 */

@Controller
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    
    @GetMapping("/index")
    public String getAllProduct(ModelMap model){
        model.addAttribute("allProducts",productService.getAllProducts());
        return "index";
    }
    
    @GetMapping("/texts")
    public ResponseEntity<List<ProductModel>> getAllProduct(){
        List<ProductModel> texts = productService.getAllText();
        return new ResponseEntity<List<ProductModel>>(texts, HttpStatus.OK);
    }
    
    @GetMapping("/productdetail/{id}")
    public ResponseEntity<ProductModel> getProductDetailById(@PathVariable("id") int id){
        ProductModel infoProductDetail = productService.getById(id);
        return new ResponseEntity<ProductModel>(infoProductDetail, HttpStatus.OK);
    }
    
}
