package SoftwareProcess.Shobshop.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipping")
public class ShippingModel {

    @Id
    @Column(name = "ShippingId")
    private int shippingId;

    @Column(name = "Tracking")
    private int tracking;
    
    @Column(name ="TypeOfShipping")
    private String typeOfShipping;

    
	public int getShippingid()
	{
		return this.shippingId;
	}

	public void setShippingid(int shippingId)
	{
		this.shippingId = shippingId;
	}

	public int getTracking()
	{
		return this.tracking;
	}

	public void setTracking(int tracking)
	{
		this.tracking = tracking;
	}

	public String getTypeofshipping()
	{
		return this.typeOfShipping;
	}

	public void setTypeofshipping(String typeOfShipping)
	{
		this.typeOfShipping = typeOfShipping;
	}

}