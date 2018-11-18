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
public class ShippingModel{
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

	public int getShippingid()
	{
		return this.shippingId;
	}

	public void setShippingid(int shippingId)
	{
		this.shippingId = shippingId;
	}

	public double getShippingprice()
	{
		return this.shippingPrice;
	}

	public void setShippingprice(double shippingPrice)
	{
		this.shippingPrice = shippingPrice;
	}

	public TypeofshippingModel getTypeofshippingid()
	{
		return this.typeOfShippingId;
	}

	public void setTypeofshippingid(TypeofshippingModel typeOfShippingId)
	{
		this.typeOfShippingId = typeOfShippingId;
	}

	public ProductModel getProductid()
	{
		return this.productId;
	}

	public void setProductid(ProductModel productId)
	{
		this.productId = productId;
	}


}