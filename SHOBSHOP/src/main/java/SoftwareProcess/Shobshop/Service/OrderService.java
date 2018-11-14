package SoftwareProcess.Shobshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoftwareProcess.Shobshop.Repository.OrderRepository;

@Service
public class OrderService{
    @Autowired
    OrderRepository OrderRepository;


}