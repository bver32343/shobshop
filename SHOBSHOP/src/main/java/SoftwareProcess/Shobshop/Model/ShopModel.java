package SoftwareProcess.Shobshop.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "shop")
public class ShopModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;

    @NotBlank
    private String shopName;
    
    @NotBlank
    private String shopDetail;
    
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private UserModel userId;

    public int getShopId() {
        return this.shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDetail() {
        return this.shopDetail;
    }

    public void setShopDetail(String shopDetail) {
        this.shopDetail = shopDetail;
    }

    public UserModel getUserId() {
        return this.userId;
    }

    public void setUserId(UserModel userId) {
        this.userId = userId;
    }

}