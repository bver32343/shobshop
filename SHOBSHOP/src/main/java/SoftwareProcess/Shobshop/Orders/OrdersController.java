package SoftwareProcess.Shobshop.Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrdersController {
    @Autowired
    OrdersService OrdersService;
    

}