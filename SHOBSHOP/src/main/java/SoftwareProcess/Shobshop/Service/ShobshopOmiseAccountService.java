/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Service;

import SoftwareProcess.Shobshop.Model.ShobshopOmiseAccountModel;
import SoftwareProcess.Shobshop.Repository.ShobshopOmiseAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saknarong
 */
@Service
public class ShobshopOmiseAccountService {

    @Autowired
    ShobshopOmiseAccountRepository shobshopOmiseAccountRepository;

    public ShobshopOmiseAccountModel getShobshopOmiseAccountModel(int shobshopOmiseAccountId) {
        return shobshopOmiseAccountRepository.findByShobshopOmiseAccountId(shobshopOmiseAccountId);
    }
}
