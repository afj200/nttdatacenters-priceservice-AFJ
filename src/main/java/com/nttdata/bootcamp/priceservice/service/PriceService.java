package com.nttdata.bootcamp.priceservice.service;

import java.util.List;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.priceservice.model.Prices;
import com.nttdata.bootcamp.priceservice.repository.PriceRepository;

@RefreshScope
@Service
public class PriceService {

	private PriceRepository priceRepository;
	
	public PriceService(PriceRepository priceRepository) { this.priceRepository = priceRepository;}
	
	public Prices getById(int priceId) {
		return priceRepository.findById(priceId);
	}
	
	public List<Prices> getAll(){
		return priceRepository.findAll();
	}
	
}
