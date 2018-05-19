package com.senhas.controler.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.senhas.controler.domain.Index;
import com.senhas.controler.services.IndexService;

@RestController
@RequestMapping(value = "senhas")
public class IndexResource {

	@Autowired
	private IndexService IndexService;	
	
	@RequestMapping(method = RequestMethod.GET)	
	public ResponseEntity<Optional<Index>> findAll(Integer id) {
		id = 1;
		Optional<Index> obj = IndexService.findById(id);

		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> update(@RequestBody Index obj, Integer id){
		id = 1;
		obj.setId(id);
		obj = IndexService.update(obj);
		return ResponseEntity.noContent().build();
	}
	
}