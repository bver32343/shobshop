package SoftwareProcess.Shobshop.Model;

import java.sql.Date;
import java.time.LocalDate;

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
@Table(name ="orders")
public class OrderModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
	
	@NotBlank
	private LocalDate date;
	
	@NotBlank
	private Double totalPrice;

	@NotBlank
	private int typeOfShipping;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private UserModel userId;
   // @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore

	public int getTypeOfShipping()
	{
		return this.typeOfShipping;
	}

	public void setTypeOfShipping(int typeOfShipping)
	{
		this.typeOfShipping = typeOfShipping;
	}

	public int getOrderid()
	{
		return this.orderId;
	}

	public void setOrderid(int orderId)
	{
		this.orderId = orderId;
	}

	public LocalDate getDate()
	{
		return this.date;
	}

	public void setDate(LocalDate localDate)
	{
		this.date = localDate;
	}

	public Double getTotalprice()
	{
		return this.totalPrice;
	}

	public void setTotalprice(Double totalPrice)
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