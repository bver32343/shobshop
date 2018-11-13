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

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.apache.catalina.User;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "order")
public class OrderModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OderId")
	
    private int orderId;
	
	@Column(name = "Date")
	private Date date;
	
	@Column(name = "TotalPrice")
	private int totalPrice;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
   // @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
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