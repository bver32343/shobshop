package SoftwareProcess.Shobshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import SoftwareProcess.Shobshop.Service.UserService;

@Controller
    public class UserController {
        @Autowired
        UserService userService;
        
}