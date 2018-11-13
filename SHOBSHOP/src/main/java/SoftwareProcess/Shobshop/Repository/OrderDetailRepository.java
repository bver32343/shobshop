/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Repository;

import SoftwareProcess.Shobshop.Model.OrderDetailModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author saknarong
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetailModel, Integer>{
    
}