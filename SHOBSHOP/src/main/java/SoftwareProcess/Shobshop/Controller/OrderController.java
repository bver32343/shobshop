package SoftwareProcess.Shobshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import SoftwareProcess.Shobshop.Model.AddressModel;
import SoftwareProcess.Shobshop.Model.UserModel;
import SoftwareProcess.Shobshop.Service.OrderService;

@Controller
public class OrderController{
    @Autowired
    OrderService OrderService;
    @GetMapping("/account")
    public String test(ModelMap modelmap){
        modelmap.put("user",new UserModel());
        modelmap.put("address",new AddressModel());
        return "test";
    }

    @GetMapping("/testsave")
    public String testsave(ModelMap modelmap,
        @ModelAttribute("user") UserModel usermodel){
       // modelmap.put("user",new UserModel());

        return "testsave";
    }
}