package SoftwareProcess.Shobshop.Repository;

import SoftwareProcess.Shobshop.Model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressModel, Integer>{
    public AddressModel findByAddressId(int addressId);
}