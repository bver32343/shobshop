package SoftwareProcess.Shobshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoftwareProcess.Shobshop.Model.ShippingModel;
import SoftwareProcess.Shobshop.Repository.ShippingRepository;

import java.util.List;

@Service
public class ShippingService{
    @Autowired
    ShippingRepository shippingRepository;

    public List<ShippingModel>searchByProductId(int productId){
        return shippingRepository.findByProductId(productId);
    }

}