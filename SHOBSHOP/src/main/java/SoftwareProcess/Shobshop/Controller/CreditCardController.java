/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProcess.Shobshop.Controller;

import co.omise.Client;
import co.omise.ClientException;
import co.omise.models.Charge;
import co.omise.models.OmiseException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author saknarong
 */
@Controller
public class CreditCardController {

    @GetMapping("/testOmise")
    
    public String testOmise(){
        return "testOmise";
    }
    
    @GetMapping ("/testOmiseInProgress")
    public String testOmiseInProgress(HttpServletRequest request) throws ClientException, IOException, OmiseException{
        String amountWithWord = request.getParameter("description");
        String customerToken = request.getParameter("omiseToken");
        int indexOfBathSign = amountWithWord.indexOf("฿");
        String amountInStringType = amountWithWord.substring(indexOfBathSign+1, amountWithWord.length());
        Double amountInDoubleType = Double.parseDouble(amountInStringType)*100;
        Long amountInLongType = amountInDoubleType.longValue();
        
        
        Client shobShopAccount = new Client("pkey_test_5dxu0b1vxc7ui06csew","skey_test_5dxu0b1w7j96qyz5447");
        Charge charge = shobShopAccount.charges().create(new Charge.Create()
                .amount(amountInLongType)
                .currency("THB")
                .card(customerToken));
        return "index";
    }
}
