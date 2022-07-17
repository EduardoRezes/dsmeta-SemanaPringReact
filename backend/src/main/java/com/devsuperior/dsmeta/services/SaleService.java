//Componente responsavel por implementar operações de negocios.
package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service//Registrando para o sistema que essa classe é um componente.
public class SaleService {

	@Autowired
	private SaleRepository repository; //Importando a interface com o CRUD para persistencia com o banco.
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) { 
		/* Page do Java é responsavel pela paginação dos dados, antes colocamos uma List como tipo de dado do retorno, assim a Controller tambem iria retornar
		 * uma Lista de Sales, porem como uma boa pratica é sempre usar a paginação, para que a aplicação não fique sobrecarregada e lenta.
		 * */
		
		/* Criando uma data com o dia atual do sistema */
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate); //Expressão condição alternada ternaria.
		
		return repository.findSales(min, max, pageable);
	}
}
