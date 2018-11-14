package SoftwareProcess.Shobshop.Repository;

import SoftwareProcess.Shobshop.Model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Integer>{
    
}