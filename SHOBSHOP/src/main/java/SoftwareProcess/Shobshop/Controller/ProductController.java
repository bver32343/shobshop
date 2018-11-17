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
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


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
        List<ProductModel> allProducts = productService.getAllProducts();
        model.addAttribute("allProducts",allProducts);
        return "index";
    }
    
    @GetMapping("/texts")
    public ResponseEntity<List<ProductModel>> getAllProduct(){
        List<ProductModel> texts = productService.getAllText();
        return new ResponseEntity<>(texts, HttpStatus.OK);
    }
    
    @GetMapping("/productDetail/{id}")
    public String getProductDetailById(@PathVariable("id") int id ,Model model){
        ProductModel productId = productService.getById(id);
        model.addAttribute("productDetail", productId);
        return "ProductDetail";
    }
    
    @GetMapping("/search")
    public String searchProductByName(@RequestParam("search") String name,Model model){
        List<ProductModel> searchProduct = productService.searchByName(name);
        model.addAttribute("output", searchProduct);
        return "search";
    }
}
