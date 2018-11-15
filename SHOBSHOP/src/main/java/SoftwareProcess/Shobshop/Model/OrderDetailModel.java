package SoftwareProcess.Shobshop.Model;

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

@Entity
@Table(name ="orderdetail")
public class OrderDetailModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderDetailId;

    @NotBlank
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private ProductModel productId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private OrderModel orderId;


	public int getOrderdetailId()
	{
		return this.orderDetailId;
	}

	public void setOrderdetailId(int orderDetailId)
	{
		this.orderDetailId = orderDetailId;
	}

	public int getQuantity()
	{
		return this.quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public ProductModel getProductId()
	{
		return this.productId;
	}

	public void setProductId(ProductModel productId)
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