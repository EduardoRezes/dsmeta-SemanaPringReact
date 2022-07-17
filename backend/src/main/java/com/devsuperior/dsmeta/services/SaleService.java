//Componente responsavel por implementar operações de negocios.
package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service//Registrando para o sistema que essa classe é um componente.
public class SaleService {

	@Autowired
	private SaleRepository repository; //Importando a interface com o CRUD para persistencia com o banco.
	
	public List<Sale> fundSales() {
		return repository.findAll();
	}
}
