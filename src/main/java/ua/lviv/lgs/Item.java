package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Set;

public class Item {
	private Integer id;
	private Double total;
	private Set<Cart> setcart = new HashSet<Cart>();

	/**
	 * 
	 */
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param total
	 * @param setcart
	 */
	public Item(Double total, Set<Cart> setcart) {
		super();
		this.setTotal(total);
		this.setcart = setcart;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((setcart == null) ? 0 : setcart.hashCode());
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
		Item other = (Item) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (setcart == null) {
			if (other.setcart != null)
				return false;
		} else if (!setcart.equals(other.setcart))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", total=" + total + ", setcart=" + setcart + "]";
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
	 * @return the setcart
	 */
	public Set<Cart> getSetcart() {
		return setcart;
	}

	/**
	 * @param setcart the setcart to set
	 */
	public void setSetcart(Set<Cart> setcart) {
		this.setcart = setcart;
	}

	/**
	 * @param total
	 */
	public Item(Double total) {
		super();
		this.setTotal(total);
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
