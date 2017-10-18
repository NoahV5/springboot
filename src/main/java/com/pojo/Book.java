package com.pojo;

import io.swagger.annotations.ApiModel;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Aaron on 2017/10/17.
 */
@ApiModel
public class Book {

	private Long id;

	private Long price;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override public String toString() {
		return "Book{" + "id=" + id + ", price=" + price + ", name='" + name + '\'' + '}';
	}
}
