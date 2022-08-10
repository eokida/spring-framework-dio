package br.com.santander.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_item")
public class PurchaseItem implements Serializable {
	
	private static final long serialVersionUID = -7814228456111605672L;

	@Id
	private Integer seq;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "purchase_id")
	private Purchase purchase;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fruit_id", nullable = false)
	private Fruit fruit;
	
	private double amount;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}


	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	

}
