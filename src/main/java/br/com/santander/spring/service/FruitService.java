package br.com.santander.spring.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.santander.spring.model.Fruit;
import br.com.santander.spring.repository.FruitRepository;

@Service
public class FruitService {

	private final FruitRepository fruitRepository;
	
	public FruitService(FruitRepository fruitRepository) {
		this.fruitRepository = fruitRepository;
	}
	
	@Transactional(readOnly = true)
	public List<Fruit> findAll() {
		return fruitRepository.findAll();
	}
	
	@Transactional
	public void save(@Valid Fruit fruit) {
		
		//if (fruit.getType()==null)
		fruitRepository.save(fruit);
		//return Optional.of(fruitRepository.save(fruit)).orElseThrow(() -> new RuntimeException("ERROR"));
		
	}
	
}
