package com.spring.datajpa1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
		uniqueConstraints = {
                @UniqueConstraint(
                        name = "sku_unique",
                        columnNames = "stock_keeping_unit"
                )
        }
		)

public class Product {

		@Id
	    @GeneratedValue(
	            strategy = GenerationType.SEQUENCE,
	            generator = "product_generator"
	    )
	 
	 @SequenceGenerator(
			 
			 name= "product_generator",
			 sequenceName = "product_sequence_name",
			 allocationSize = 1
			 )
	 

	private int id ;
	@Column(name = "stock_keeping_unit",nullable = true)
	private String stock_keeping_unit;
	private String name;
	private String description;
    private BigDecimal price;
    private boolean active;
    private String imageUrl;
	@UpdateTimestamp
	private LocalDateTime dupdated;
	
	
	
	
	public Product(String stock_keeping_unit, String name, String description, BigDecimal price, boolean active,
			String imageUrl, LocalDateTime dupdated) {
		super();
		this.stock_keeping_unit = stock_keeping_unit;
		this.name = name;
		this.description = description;
		this.price = price;
		this.active = active;
		this.imageUrl = imageUrl;
		this.dupdated = dupdated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public LocalDateTime getDupdated() {
		return dupdated;
	}
	public void setDupdated(LocalDateTime dupdated) {
		this.dupdated = dupdated;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + " , name=" + name + ", description=" + description + ", price="
				+ price + ", active=" + active + ", imageUrl=" + imageUrl + ", dupdated=" + dupdated + "]";
	}
	
	
	


	
	
	
	
	
	
}
