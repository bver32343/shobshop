package SoftwareProcess.Shobshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class OrdersController {
    @Autowired
    SoftwareProcess.Shobshop.Service.OrdersService OrdersService;
    @GetMapping("/")
    public String show(ModelMap model){
        String hello = "Hello Pattarachai!";
        model.addAttribute("testHello",hello);
        return "index";
    }
    

}