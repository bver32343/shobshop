package SoftwareProcess.Shobshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SoftwareProcess.Shobshop.Model.Orders;

public interface OrdersRepository extends JpaRepository<Orders,Integer>{

}