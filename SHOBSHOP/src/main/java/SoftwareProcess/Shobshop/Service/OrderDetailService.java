package SoftwareProcess.Shobshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoftwareProcess.Shobshop.Repository.OrderDetailRepository;

@Service
public class OrderDetailService{
    @Autowired
    OrderDetailRepository OrderDetailRepository;


}