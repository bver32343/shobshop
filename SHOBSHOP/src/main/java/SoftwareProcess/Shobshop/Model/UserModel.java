package SoftwareProcess.Shobshop.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel{
    @Id
    @Column(name = "UserId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;



    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "E-mail")
    private String email;

    @Column(name = "PhoneNumber")
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