package SoftwareProcess.Shobshop.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="orderdetail")
public class OrderDetailModel {

    @Id
    @Column(name = "OrderDetailId")
    private int orderDetail;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "ProductId")
    private ProductModel productId;

    @Column(name = "OrderId")
    private OrderModel orderId;


	public int getOrderdetail()
	{
		return this.orderDetail;
	}

	public void setOrderdetail(int orderDetail)
	{
		this.orderDetail = orderDetail;
	}

	public int getQuantity()
	{
		return this.quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public ProductModel getProductid()
	{
		return this.productId;
	}

	public void setProductid(ProductModel productId)
	{
		this.productId = productId;
	}

	public OrderModel getOrderid()
	{
		return this.orderId;
	}

	public void setOrderid(OrderModel orderId)
	{
		this.orderId = orderId;
	}

}