package SoftwareProcess.Shobshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoftwareProcess.Shobshop.Repository.ShopRepository;

@Service
public class ShopService {

    @Autowired
    ShopRepository shopRepository;

}
