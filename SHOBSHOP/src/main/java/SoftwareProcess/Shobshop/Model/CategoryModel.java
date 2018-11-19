package SoftwareProcess.Shobshop.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String CategoryName;

	public int getCategoryId()
	{
		return this.categoryId;
	}

	public void setCategoryId(int categoryId)
	{
		this.categoryId = categoryId;
	}

	public String getCategoryName()
	{
		return this.CategoryName;
	}

	public void setCategoryName(String CategoryName)
	{
		this.CategoryName = CategoryName;
	}


}