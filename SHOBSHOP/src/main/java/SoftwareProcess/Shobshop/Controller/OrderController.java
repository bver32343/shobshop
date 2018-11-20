package SoftwareProcess.Shobshop.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import SoftwareProcess.Shobshop.Model.AddressModel;
import SoftwareProcess.Shobshop.Model.CreditCardModel;
import SoftwareProcess.Shobshop.Model.OrderDetailModel;
import SoftwareProcess.Shobshop.Model.OrderModel;
import SoftwareProcess.Shobshop.Model.ProductModel;
import SoftwareProcess.Shobshop.Model.ShippingModel;
import SoftwareProcess.Shobshop.Model.ShobshopOmiseAccountModel;
import SoftwareProcess.Shobshop.Model.TypeofshippingModel;
import SoftwareProcess.Shobshop.Model.UserModel;
import SoftwareProcess.Shobshop.Service.AddressService;
import SoftwareProcess.Shobshop.Service.CreditCardService;
import SoftwareProcess.Shobshop.Service.OrderDetailService;
import SoftwareProcess.Shobshop.Service.OrderService;
import SoftwareProcess.Shobshop.Service.ProductService;
import SoftwareProcess.Shobshop.Service.UserService;
import SoftwareProcess.Shobshop.Service.ShippingService;
import SoftwareProcess.Shobshop.Service.ShobshopOmiseAccountService;
import co.omise.ClientException;
import co.omise.models.OmiseException;
import java.io.IOException;

@Controller
public class OrderController {

    @Autowired
    ShobshopOmiseAccountService shobshopOmiseAccountService;

    @Autowired
    OrderService orderService;

    @Autowired
    OrderDetailService orderDetailService;

    @Autowired
    AddressService addressService;

    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    @Autowired
    CreditCardService creditCardService;

    @Autowired
    ShippingService shippingService;


    @GetMapping("confirmorder/{id}")
    public String ConfirmOrder(@PathVariable("id") int id, ModelMap modelMap) {
        ProductModel productModel = new ProductModel();
        productModel.setProductId(id);
        List<ShippingModel> allShipping = shippingService.getByProductId(productModel);
        modelMap.addAttribute("allShipping", allShipping);
        ShobshopOmiseAccountModel shobshopAccount = shobshopOmiseAccountService.getShobshopOmiseAccountModel(1);
        modelMap.addAttribute("shobshopAccount", shobshopAccount);
        modelMap.addAttribute("allShipping", allShipping);
        modelMap.addAttribute("product", productService.getById(id));
        return "shopping";
    }

    @PostMapping("/summary")
    public String bill(ModelMap modelmap,
            HttpServletRequest request) throws ClientException, IOException, OmiseException {

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

        String shippingId = request.getParameter("shippingId");
        String totalPrice = request.getParameter("totalPrice");
        String quantity = request.getParameter("quantity");

        String productIdParam = request.getParameter("productId");

        UserModel userModel = new UserModel();
        userModel.setEmail(email);
        userModel.setFirstname(firstname);
        userModel.setLastname(lastname);
        userModel.setPhonenumber(phonenumber);
        userService.save(userModel);

        AddressModel addressModel = new AddressModel();
        addressModel.setAlley(alley);
        addressModel.setCity(city);
        addressModel.setCountry(country);
        addressModel.setDistrict(district);
        addressModel.setHomeNo(homeNo);
        addressModel.setPostCode(Integer.parseInt(postCode));
        addressModel.setRoad(road);
        addressModel.setSubDistrict(subDistrict);
        addressModel.setUserId(userModel);
        addressService.save(addressModel);

        ShippingModel shoppingModel = new ShippingModel();
        shoppingModel.setShippingId(Integer.parseInt(shippingId));
        OrderModel orderModel = new OrderModel();
        orderModel.setTotalPrice(Double.parseDouble(totalPrice));
        orderModel.setShippingId(shoppingModel);
        orderModel.setUserId(userModel);
        orderModel.setDate(java.time.LocalDate.now());
        orderService.save(orderModel);

        int productId = Integer.parseInt(productIdParam);
        ProductModel productModel = new ProductModel();
        productModel.setProductId(productId);

        OrderDetailModel orderDetailModel = new OrderDetailModel();
        orderDetailModel.setQuantity(Integer.parseInt(quantity));
        orderDetailModel.setProductId(productModel);
        orderDetailModel.setOrderId(orderModel);
        orderDetailService.save(orderDetailModel);

        CreditCardModel creditCardModel = new CreditCardModel();
        creditCardModel.setCreditCardName(request.getParameter("creditCardName"));
        creditCardModel.setCreditCardNumber(request.getParameter("creditCardNumber"));
        creditCardModel.setUserId(userModel);
        ShobshopOmiseAccountModel shobshopOmiseAccountModel = shobshopOmiseAccountService.getShobshopOmiseAccountModel(Integer.parseInt(request.getParameter("shobshopAccountId")));
        creditCardService.creditCardPayment(request.getParameter("omiseToken"), request.getParameter("totalPrice"), shobshopOmiseAccountModel.getPublickey(), shobshopOmiseAccountModel.getSecretkey());
        creditCardService.save(creditCardModel);

        modelmap.addAttribute("product", productService.getById(productModel.getProductId()));
        modelmap.addAttribute("user", userService.getById(userModel.getUserId()));
        modelmap.addAttribute("address", addressService.getById(addressModel.getAddressId()));
        modelmap.addAttribute("order", orderService.getById(orderModel.getOrderId()));
        modelmap.addAttribute("shipping", shippingService.getByShippingId(Integer.parseInt(shippingId)));
        modelmap.addAttribute("orderDetail", orderDetailService.getById(orderDetailModel.getOrderdetailId()));
        return "Summary";
    }
}
