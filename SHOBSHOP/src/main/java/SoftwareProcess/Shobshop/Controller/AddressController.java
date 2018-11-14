package SoftwareProcess.Shobshop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import SoftwareProcess.Shobshop.Service.AddressService;

@Controller
public class AddressController{
@Autowired
AddressService addressService;

}