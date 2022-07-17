package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;

//Componente do sistema que tem por sua responsabilidade acessar o banco de dados;
public interface SaleRepository extends JpaRepository<Sale, Long>{
	//Criado o "componente" com todo o CRUD para persistencia com o banco de dados.
	//Apenas Extendendo da JpaRepository passando a entidade e o tipo de dado do ID.
	
	/* Query para consulta do bando de dados com datas.*/
	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);
}

