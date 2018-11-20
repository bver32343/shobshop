/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Repository;

import SoftwareProcess.Shobshop.Model.ProductModel;
import SoftwareProcess.Shobshop.Model.ShobshopOmiseAccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author saknarong
 */
public interface ShobshopOmiseAccountRepository extends JpaRepository<ShobshopOmiseAccountModel, Integer> {
    ShobshopOmiseAccountModel findByShobshopOmiseAccountId(int shobshopOmiseAccountId);
}
