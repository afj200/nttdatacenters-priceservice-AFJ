package com.nttdata.bootcamp.priceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.priceservice.controller.constants.EndPointUris;
import com.nttdata.bootcamp.priceservice.model.Prices;
import com.nttdata.bootcamp.priceservice.service.PriceService;

@RestController
@RequestMapping(EndPointUris.CONTROLLER)
public class PriceController {

	/**
	 * Instancia del servicio que gestiona los precios.
	 */
	@Autowired
	private PriceService priceService;
	
	@GetMapping(EndPointUris.ID)
	public ResponseEntity<Prices> getPrice(final @PathVariable Integer id){
		return ResponseEntity.ok(priceService.getById(id));
	}
	
	@GetMapping(EndPointUris.GET)
	public ResponseEntity<List<Prices>> getAllPrices(){
		return ResponseEntity.ok(priceService.getAll());
	}
}
