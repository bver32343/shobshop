package SoftwareProcess.Shobshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import SoftwareProcess.Shobshop.Model.UserModel;
import SoftwareProcess.Shobshop.Service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

}
