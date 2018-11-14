package SoftwareProcess.Shobshop.Repository;

import SoftwareProcess.Shobshop.Model.OrderDetailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetailModel, Integer>{
    
}