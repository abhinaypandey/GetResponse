/**
 *
 * This comment is NOT a class level javadoc comment. 
 * 
 * @description: 
 * @author: singhda
 * @version: 
 *
 */
package com.amgen.getResponse.entity.campaign;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="USER_AUTO")
	@SequenceGenerator(name="USER_AUTO", sequenceName="USER_AUTO", allocationSize=1)
	@Column(name = "productId")
	
	public int productId;	
	
	
	@Column(name="productName")
    private String productName;
	
	
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
