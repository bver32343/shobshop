package SoftwareProcess.Shobshop.Controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import SoftwareProcess.Shobshop.Model.AddressModel;
import SoftwareProcess.Shobshop.Model.OrderDetailModel;
import SoftwareProcess.Shobshop.Model.OrderModel;
import SoftwareProcess.Shobshop.Model.ProductModel;
import SoftwareProcess.Shobshop.Model.UserModel;
import SoftwareProcess.Shobshop.Service.AddressService;
import SoftwareProcess.Shobshop.Service.OrderDetailService;
import SoftwareProcess.Shobshop.Service.OrderService;
import SoftwareProcess.Shobshop.Service.UserService;

@Controller
public class OrderController{
    @Autowired
    OrderService orderService;

    @Autowired
    OrderDetailService orderDetailService;

    @Autowired
    AddressService addressService;

    @Autowired
    UserService userService;

    @GetMapping("/confirmorder")
    public String ConfirmOrdertestder(){
        return "shopping";
    }

    @GetMapping("/testsave")
    public String bill(ModelMap modelmap,
            HttpServletRequest request){
        
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String phonenumber = request.getParameter("phonenumber");
        System.out.println("get success user");

        String alley = request.getParameter("alley");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String district = request.getParameter("district");
        String homeNo = request.getParameter("homeNo");
        String postCode = request.getParameter("postCode");
        String road = request.getParameter("road");
        String subDistrict = request.getParameter("subDistrict");
        System.out.println("save success address");

        String typeOfShipping = request.getParameter("typeOfShipping");
        String totalPrice = request.getParameter("totalPrice");
        String quantity = request.getParameter("quantity");	
        System.out.println("save success order");
        

        UserModel userModel = new UserModel();
        userModel.setEmail(email);
        userModel.setFirstname(firstname);
        userModel.setLastname(lastname);
        userModel.setPhonenumber(phonenumber);
        userService.save(userModel);
        System.out.println("save success user");

        AddressModel addressModel = new AddressModel();
        addressModel.setAlley(alley);
        addressModel.setCity(city);
        addressModel.setCountry(country);
        addressModel.setDistrict(district);
        addressModel.setHomeno(homeNo);
        addressModel.setPostcode(Integer.parseInt(postCode));
        addressModel.setRoad(road);
        addressModel.setSubdistrict(subDistrict);
        addressModel.setUserId(userModel);
        addressService.save(addressModel);
        System.out.println("save success address");

        OrderModel orderModel = new OrderModel();
        orderModel.setTotalprice(Double.parseDouble(totalPrice));
        orderModel.setTypeOfShipping(Integer.parseInt(typeOfShipping));
        orderModel.setUserId(userModel);
        orderModel.setDate(java.time.LocalDate.now());
        orderService.save(orderModel);
        System.out.println("save success order");

        int productId = 1;
        ProductModel productModel = new ProductModel();
        productModel.setProductId(productId);
        OrderDetailModel orderDetailModel = new OrderDetailModel();
        orderDetailModel.setQuantity(Integer.parseInt(quantity));
        orderDetailModel.setProductId(productModel);
        orderDetailModel.setOrderId(orderModel);
        orderDetailService.save(orderDetailModel);
        System.out.println("save success orderdetail");

        System.out.println("user: id"+userModel.getUserId()+" "+email+" "+ phonenumber+" "+firstname+" "+ lastname);
        System.out.println("address: id "+userModel.getUserId()+" "+alley+" "+ city+" "+country+" "+ district+" "+ homeNo+" "+road+" "+ subDistrict);
        System.out.println("order: id "+userModel.getUserId()+" total price: "+totalPrice+" type ship : "+ typeOfShipping+" "+java.time.LocalDate.now()+" quantity : ");
        System.out.println("orderdetail: quantity "+" order id:  "+ orderModel.getOrderId());
        
        return "testsave";
    }
}