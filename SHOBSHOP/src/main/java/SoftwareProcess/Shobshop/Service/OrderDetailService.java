package SoftwareProcess.Shobshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoftwareProcess.Shobshop.Model.OrderDetailModel;
import SoftwareProcess.Shobshop.Repository.OrderDetailRepository;

@Service
public class OrderDetailService {

    @Autowired
    OrderDetailRepository OrderDetailRepository;

    public OrderDetailModel save(OrderDetailModel orderdetail) {
        return OrderDetailRepository.save(orderdetail);
    }

    public OrderDetailModel getById(int orderDetailId) {
        return OrderDetailRepository.findByOrderDetailId(orderDetailId);
    }

}
