/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Repository;

import SoftwareProcess.Shobshop.Model.ProductModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author saknarong
 */
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

    ProductModel findByProductId(int productId);

    ProductModel findByProductName(String productname);

    List<ProductModel> findByProductNameContaining(String productname);
}
