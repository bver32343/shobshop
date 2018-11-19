package SoftwareProcess.Shobshop.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "shobshopomiseaccount")
public class ShobshopOmiseAccountModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shobshopOmiseAccountId;
    @NotBlank
    private String publicKey;
    @NotBlank
    private String secretKey;

	public int getShobshopomiseaccountid()
	{
		return this.shobshopOmiseAccountId;
	}

	public void setShobshopomiseaccountid(int shobshopOmiseAccountId)
	{
		this.shobshopOmiseAccountId = shobshopOmiseAccountId;
	}

	public String getPublickey()
	{
		return this.publicKey;
	}

	public void setPublickey(String publicKey)
	{
		this.publicKey = publicKey;
	}

	public String getSecretkey()
	{
		return this.secretKey;
	}

	public void setSecretkey(String secretKey)
	{
		this.secretKey = secretKey;
	}

}