package SoftwareProcess.Shobshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoftwareProcess.Shobshop.Model.AddressModel;
import SoftwareProcess.Shobshop.Repository.AddressRepository;

@Service
public class AddressService{
@Autowired
AddressRepository AddressRepository;

    public AddressModel save(AddressModel address){
        return AddressRepository.save(address);
    }
}
