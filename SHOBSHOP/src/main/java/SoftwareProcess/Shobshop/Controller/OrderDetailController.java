package SoftwareProcess.Shobshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import SoftwareProcess.Shobshop.Service.OrderDetailService;

@Controller
public class OrderDetailController {

    @Autowired
    OrderDetailService OrderDetailService;

}
