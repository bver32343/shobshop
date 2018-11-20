package SoftwareProcess.Shobshop.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Shipping")
public class ShippingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shippingId;
    @NotBlank
    private double shippingPrice;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_of_shipping_id", nullable = false)
    private TypeofshippingModel typeOfShippingId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private ProductModel productId;

    public int getShippingId() {
        return this.shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public double getShippingPrice() {
        return this.shippingPrice;
    }

    public void setShippingPrice(double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public TypeofshippingModel getTypeOfShippingId() {
        return this.typeOfShippingId;
    }

    public void setTypeOfShippingId(TypeofshippingModel typeOfShippingId) {
        this.typeOfShippingId = typeOfShippingId;
    }

    public ProductModel getProductId() {
        return this.productId;
    }

    public void setProductId(ProductModel productId) {
        this.productId = productId;
    }

}
