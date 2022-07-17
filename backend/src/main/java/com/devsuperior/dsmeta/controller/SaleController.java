//Controler é responsavel pelos end-points da aplicação.
package com.devsuperior.dsmeta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	/*
	 * Padrão de 3 Camadas
	 * 1 - Controller
	 * 2 - Service
	 * 3 - Repository
	 * */
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public Page<Sale> findSales(
			/* Passando a data selecionada pelo user la no front-and, colocando a anotação @RequestParam e dentro dela passando o nome do parametro e o 
			 * default caso não tenha uma data setada.
			 */
			@RequestParam(value = "minDate", defaultValue = "") String minDate, 
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, 
			Pageable pageable) {
		
		/* Estamos utilizando dentro da controller o Page, para realizar a paginação dos dados que estão sendo consultados.
		 * Lembre-se que a Service tem que estar igual, se usarmos List na Service, aqui tambem usaremos List, se for Page, da mesma forma.
		 * Não podemos esquecer de passar sempre a variavel pageable para informar.*/
		return service.findSales(minDate, maxDate, pageable);
	}
}
