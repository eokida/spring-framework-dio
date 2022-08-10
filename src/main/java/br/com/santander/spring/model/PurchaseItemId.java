package br.com.santander.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Embeddable
public class PurchaseItemId implements Serializable {
	
	private static final long serialVersionUID = 4607839983488338441L;

	private Integer seq;
	
	@ManyToOne(targetEntity = Purchase.class)
	private Long purchase;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Long getPurchase() {
		return purchase;
	}

	public void setPurchase(Long purchase) {
		this.purchase = purchase;
	}


}
