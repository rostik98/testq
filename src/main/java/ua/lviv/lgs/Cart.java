package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Set;

public class Cart {
	private Integer id;
	private Double total;
	private String name;
	private Set<Item> itemcart = new HashSet<Item>();

	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", name=" + name + ", itemcart=" + itemcart + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemcart == null) ? 0 : itemcart.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemcart == null) {
			if (other.itemcart != null)
				return false;
		} else if (!itemcart.equals(other.itemcart))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}

	/**
	 * 
	 */
	public Cart() {
		super();
	}

	/**
	 * @param total
	 * @param name
	 * @param itemcart
	 */
	public Cart(Double total, String name, Set<Item> itemcart) {
		super();
		this.total = total;
		this.name = name;
		this.itemcart = itemcart;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the itemcart
	 */
	public Set<Item> getItemcart() {
		return itemcart;
	}

	/**
	 * @param itemcart the itemcart to set
	 */
	public void setItemcart(Set<Item> itemcart) {
		this.itemcart = itemcart;
	}
}
