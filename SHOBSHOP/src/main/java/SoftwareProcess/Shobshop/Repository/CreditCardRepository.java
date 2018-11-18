/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Repository;

import SoftwareProcess.Shobshop.Model.CreditCardModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author saknarong
 */
public interface CreditCardRepository extends JpaRepository<CreditCardModel, Long>{
    
}
