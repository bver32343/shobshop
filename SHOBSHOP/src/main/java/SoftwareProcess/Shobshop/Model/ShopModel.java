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
    private String shoppName;
    
    @NotBlank
    private String shopDetail;
    
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private UserModel userId;

    public int getShopid() {
        return this.shopId;
    }

    public void setShopid(int shopId) {
        this.shopId = shopId;
    }

    public String getShoppname() {
        return this.shoppName;
    }

    public void setShoppname(String shoppName) {
        this.shoppName = shoppName;
    }

    public String getShopdetail() {
        return this.shopDetail;
    }

    public void setShopdetail(String shopDetail) {
        this.shopDetail = shopDetail;
    }

    public UserModel getUserid() {
        return this.userId;
    }

    public void setUserid(UserModel userId) {
        this.userId = userId;
    }

}