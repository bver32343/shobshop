package SoftwareProcess.Shobshop.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "typeofshipping")

public class TypeofshippingModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeOfShippingId;
    
    @NotBlank
    private String typeOfShippingName;

	public int getTypeOfShippingId()
	{
		return this.typeOfShippingId;
	}

	public void setTypeOfShippingId(int typeOfShippingId)
	{
		this.typeOfShippingId = typeOfShippingId;
	}

	public String getTypeOfShippingName()
	{
		return this.typeOfShippingName;
	}

	public void setTypeOfShippingName(String typeOfShippingName)
	{
		this.typeOfShippingName = typeOfShippingName;
	}

}