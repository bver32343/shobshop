/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Service;

import SoftwareProcess.Shobshop.Model.CreditCardModel;
import SoftwareProcess.Shobshop.Repository.CreditCardRepository;
import co.omise.Client;
import co.omise.ClientException;
import co.omise.models.Charge;
import co.omise.models.OmiseException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author saknarong
 */
@Service
public class CreditCardService {

    @Autowired
    CreditCardRepository creditCardRepository;
    
    public CreditCardModel save(CreditCardModel creditCardModel){
        return creditCardRepository.save(creditCardModel);
    }

    public String creditCardPayment(String customerToken,String amountInStringType) throws ClientException, IOException, OmiseException {
        Double amountInDoubleType = Double.parseDouble(amountInStringType) * 100;
        Long amountInLongType = amountInDoubleType.longValue();

        Client shobShopAccount = new Client("pkey_test_5dxu0b1vxc7ui06csew", "skey_test_5dxu0b1w7j96qyz5447");
        Charge charge = shobShopAccount.charges().create(new Charge.Create()
                .amount(2000)
                .currency("THB")
                .card(customerToken));
        return "index";
    }
}
