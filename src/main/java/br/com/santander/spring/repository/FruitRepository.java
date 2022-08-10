package br.com.santander.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.santander.spring.model.Fruit;
import br.com.santander.spring.model.FruitGenderE;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {

	public Optional<Fruit> findByGender(FruitGenderE gender);
	
}
