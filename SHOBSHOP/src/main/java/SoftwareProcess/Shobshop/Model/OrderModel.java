package SoftwareProcess.Shobshop.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.catalina.User;

@Entity
@Table(name = "order")
public class OrderModel {

	@Id
	@Column(name = "OderId")
    private int orderId;
	
	@Column(name = "Date")
	private Date date;
	
	@Column(name = "TotalPrice")
	private int totalPrice;
	
	@Column(name = "UserId")
    private UserModel userId;

	public int getOrderid()
	{
		return this.orderId;
	}

	public void setOrderid(int orderId)
	{
		this.orderId = orderId;
	}

	public Date getDate()
	{
		return this.date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public int getTotalprice()
	{
		return this.totalPrice;
	}

	public void setTotalprice(int totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public UserModel getUserid()
	{
		return this.userId;
	}

	public void setUserid(UserModel userId)
	{
		this.userId = userId;
	}

    
}