/**
 * 
 */
package com.sohoskishop.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author george
 *
 */
@Entity
public class Ski {

	private @Id @GeneratedValue Integer id;
	private String name;
	private int age;
	private String brand;
	private String status;
	private boolean usable;

	public Ski() {
		super();
	}

	public Ski(String name, int age, String brand, String status) {
		super();
		this.name = name;
		this.age = age;
		this.brand = brand;
		this.status = status;
		this.usable = true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isUsable() {
		return usable;
	}

	public void setUsable(boolean usable) {
		this.usable = usable;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, brand, id, name, status, usable);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ski other = (Ski) obj;
		return age == other.age && Objects.equals(brand, other.brand) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(status, other.status) && usable == other.usable;
	}

	@Override
	public String toString() {
		return "  Ski id [ " + id + "  ], name [" + name + "  ], age [" + age + "  ], brand [" + brand + "  ], status ["
				+ status + "  ], usable" + usable;
	}

}
