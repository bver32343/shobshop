package SoftwareProcess.Shobshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoftwareProcess.Shobshop.Model.OrderModel;
import SoftwareProcess.Shobshop.Repository.OrderRepository;

@Service
public class OrderService{
    @Autowired
    OrderRepository OrderRepository;
    public OrderModel save(OrderModel order){
        return OrderRepository.save(order);
    }

    public OrderModel getById(int orderId){
        return OrderRepository.findByOrderId(orderId);
    }

}