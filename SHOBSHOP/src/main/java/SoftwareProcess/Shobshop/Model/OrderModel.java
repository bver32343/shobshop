package SoftwareProcess.Shobshop.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.apache.catalina.User;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name ="order")
public class OrderModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
	
	@NotBlank
	private Date date;
	
	@NotBlank
	private int totalPrice;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private UserModel userId;
   // @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore


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