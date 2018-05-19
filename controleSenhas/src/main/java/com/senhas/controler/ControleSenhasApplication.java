package com.senhas.controler;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.senhas.controler.domain.Index;
import com.senhas.controler.repositories.IndexRepository;

@SpringBootApplication
public class ControleSenhasApplication implements CommandLineRunner{
	@Autowired
	private IndexRepository indexRe;
	
	public static void main(String[] args) {
		SpringApplication.run(ControleSenhasApplication.class, args);
		
		
	}
	
	

	@Override
	public void run(String... args) throws Exception {
		Index i1 = new Index(null, 0);
		
		
		
		indexRe.saveAll(Arrays.asList(i1));
		
	}
}
