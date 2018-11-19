package SoftwareProcess.Shobshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SoftwareProcess.Shobshop.Model.ShopModel;

public interface ShopRepository extends JpaRepository<ShopModel, Integer> {

}