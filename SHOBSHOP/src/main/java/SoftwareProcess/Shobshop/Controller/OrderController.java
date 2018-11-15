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
import SoftwareProcess.Shobshop.Model.UserModel;
import SoftwareProcess.Shobshop.Service.OrderService;

@Controller
public class OrderController{
    @Autowired
    OrderService OrderService;
    @GetMapping("/test2")
    public String ConfirmOrtestder(){
        return "test";
    }

    @PostMapping("/testsave")
    public String bill(ModelMap modelmap,
            HttpServletRequest request){
        
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String phonenumber = request.getParameter("phonenumber");

        String alley = request.getParameter("alley");
        String city = request.getParameter("city");
        String country = request.getParameter("country");
        String district = request.getParameter("district");
        String homeNo = request.getParameter("homeNo");
        String postCode = request.getParameter("postCode");
        String road = request.getParameter("road");
        String subDistrict = request.getParameter("subDistrict");
       // String useridAddress = request.getParameter("email");

       String typeOfShipping = request.getParameter("typeOfShipping");
       String totalPrice = request.getParameter("totalPrice");

       String quantity = request.getParameter("quantity");	
       

        UserModel userModel = new UserModel();
        userModel.setEmail(email);
        userModel.setFirstname(firstname);
        userModel.setLastname(lastname);
        userModel.setPhonenumber(phonenumber);

        AddressModel addressModel = new AddressModel();
        addressModel.setAlley("alley");
        addressModel.setCity("city");
        addressModel.setCountry("country");
        addressModel.setDistrict("district");
        addressModel.setHomeno("homeNo");
        addressModel.setPostcode(111111);
        addressModel.setRoad("road");
        addressModel.setSubdistrict("subDistrict");
        addressModel.setUserid(userModel);

        OrderModel orderModel = new OrderModel();
        Date date = new Date();
        orderModel.setTotalprice(Double.parseDouble(totalPrice));
        orderModel.setTypeOfShipping(Integer.parseInt(typeOfShipping));
        orderModel.setUserid(userModel);
        orderModel.setDate(date);
        
        int id = 1;
        OrderDetailModel orderDetailModel = new OrderDetailModel();
        orderDetailModel.setQuantity(Integer.parseInt(quantity));
       // orderDetailModel.setProductid();
        orderDetailModel.setOrderid(orderModel);



        System.out.println("order: "+email+" "+ phonenumber+" "+firstname+" "+ lastname);
        return "testsave";
    }
}