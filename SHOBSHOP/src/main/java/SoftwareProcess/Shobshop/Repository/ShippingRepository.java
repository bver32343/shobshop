package SoftwareProcess.Shobshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SoftwareProcess.Shobshop.Model.ProductModel;
import SoftwareProcess.Shobshop.Model.ShippingModel;
import java.util.List;

public interface ShippingRepository extends JpaRepository<ShippingModel, Integer> {
    List<ShippingModel> findByProductId(ProductModel productId);
    ShippingModel findByShippingId(int shippingId);
}