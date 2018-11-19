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

    public String creditCardPayment(String customerToken,String amountInStringType,String publicKey,String secretKey) throws ClientException, IOException, OmiseException {
        Double amountInDoubleType = Double.parseDouble(amountInStringType) * 100;
        Long amountInLongType = amountInDoubleType.longValue();

        Client shobShopAccount = new Client(publicKey,secretKey);
        Charge charge = shobShopAccount.charges().create(new Charge.Create()
                .amount(amountInLongType)
                .currency("THB")
                .card(customerToken));
        return "index";
    }
}
