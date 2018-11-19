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
	
	//@NotBlank
	private LocalDate date;
	
	//@NotBlank
	private Double totalPrice;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "shipping_id", nullable = false)
    private ShippingModel shippingId;


	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private UserModel userId;
   // @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore


	public ShippingModel getShippingId()
	{
		return this.shippingId;
	}

	public void setShippingId(ShippingModel shippingId)
	{
		this.shippingId = shippingId;
	}

	public int getOrderId()
	{
		return this.orderId;
	}

	public void setOrderId(int orderId)
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

	public UserModel getUserId()
	{
		return this.userId;
	}

	public void setUserId(UserModel userId)
	{
		this.userId = userId;
	}

    
}