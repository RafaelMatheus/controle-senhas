package com.senhas.controler.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senhas.controler.domain.Index;
import com.senhas.controler.repositories.IndexRepository;

@Service
public class IndexService {
	
	@Autowired
	IndexRepository indexRepository;
	
	
	
	public Index insert(Index obj) {
		return indexRepository.save(obj);
		
	}
	
	
	public Optional<Index> findById(Integer id){
		Optional<Index> obj = indexRepository.findById(id);
		
		return obj;
	}
	
	public Index update(Index obj) {
		return indexRepository.save(obj);
	}

}
