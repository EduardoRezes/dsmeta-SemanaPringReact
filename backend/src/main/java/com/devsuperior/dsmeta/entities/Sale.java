//Entidade de Vendedor que tem por sua finalidade representar um Vendedor.
package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity						//Anotação Entity da JpaPersistence para dizer a Jpa que esse classe é uma Entidade
@Table(name = "tb_sales")	//Anotação da JpaPersistence referenciando esta classe com o nome da tabela no banco de dados.
public class Sale {
	
	@Id						//Anotação da JpaPersistence referenciando o Atributo id da Entidade
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Anotação da JpaPersistence informando que este atributo é um auto-incremente.
	private Long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	public Sale() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
