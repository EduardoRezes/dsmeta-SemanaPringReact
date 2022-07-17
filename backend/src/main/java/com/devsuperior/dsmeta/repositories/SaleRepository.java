package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

//Componente do sistema que tem por sua responsabilidade acessar o banco de dados;
public interface SaleRepository extends JpaRepository<Sale, Long>{
	//Criado o "componente" com todo o CRUD para persistencia com o banco de dados.
	//Apenas Extendendo da JpaRepository passando a entidade e o tipo de dado do ID.
}

