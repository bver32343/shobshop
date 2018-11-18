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
@Table(name = "address")
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int addressId;
    
    @NotBlank
    private String homeNo;

    @NotBlank
    private String alley;

    @NotBlank
    private String road;

    @NotBlank
    private String district;

    @NotBlank
    private String subDistrict;

    @NotBlank
    private String city;

    
    private int postCode;

    @NotBlank
    private String country;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private UserModel userId;

	public int getAddressId()
	{
		return this.addressId;
	}

	public void setAddressId(int addressId)
	{
		this.addressId = addressId;
	}

	public String getHomeno()
	{
		return this.homeNo;
	}

	public void setHomeno(String homeNo)
	{
		this.homeNo = homeNo;
	}

	public String getAlley()
	{
		return this.alley;
	}

	public void setAlley(String alley)
	{
		this.alley = alley;
	}

	public String getRoad()
	{
		return this.road;
	}

	public void setRoad(String road)
	{
		this.road = road;
	}

	public String getDistrict()
	{
		return this.district;
	}

	public void setDistrict(String district)
	{
		this.district = district;
	}

	public String getSubDistrict()
	{
		return this.subDistrict;
	}

	public void setSubDistrict(String subDistrict)
	{
		this.subDistrict = subDistrict;
	}

	public String getCity()
	{
		return this.city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public int getPostCode()
	{
		return this.postCode;
	}

	public void setPostCode(int postCode)
	{
		this.postCode = postCode;
	}

	public String getCountry()
	{
		return this.country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public UserModel getUserId()
	{
		return this.userId;
	}

	public void setUserId(UserModel userId)
	{
		this.userId = userId;
	}

}