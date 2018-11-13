package SoftwareProcess.Shobshop.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "user")
public class UserModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String email;

    @NotBlank
    private int phoneNumber;


    public UserModel(){

    }

	public int getUserid()
	{
		return this.userId;
	}

	public void setUserid(int userId)
	{
		this.userId = userId;
	}

	public String getFirstname()
	{
		return this.firstName;
	}

	public void setFirstname(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastname()
	{
		return this.lastName;
	}

	public void setLastname(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public int getPhonenumber()
	{
		return this.phoneNumber;
	}

	public void setPhonenumber(int phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}


}