package br.com.santander.spring.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santander.spring.dto.Response;
import br.com.santander.spring.model.Fruit;
import br.com.santander.spring.service.FruitService;

@RestController
@RequestMapping("/fruits")
public class FruitController {
	
	private final FruitService fruitService;
	
	public FruitController(FruitService fruitService) {
		this.fruitService = fruitService;
	}

	@GetMapping
    //@ApiOperation("Find all parkings")
    public ResponseEntity<List<Fruit>> findAll() {
        List<Fruit> list = fruitService.findAll();
        return ResponseEntity.ok(list);
    }
	
    @PostMapping
    public ResponseEntity<Response> post(@RequestBody Fruit fruit) {
    	fruitService.save(fruit);
    	Response resp = new Response("Fruit registration successfully");
    	return ResponseEntity.ok(resp);
    }
	
}
