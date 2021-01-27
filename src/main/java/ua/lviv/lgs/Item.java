package ua.lviv.lgs;

import java.util.Set;

public class Item {
	private Integer id;
	private Double total;
	private Set<Cart> setcart;

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
		this.total = total;
		this.setcart = setcart;
	}

	/**
	 * @param total
	 */
	public Item(Double total) {
		super();
		this.total = total;
	}
}
