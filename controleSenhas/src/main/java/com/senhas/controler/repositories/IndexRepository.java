package com.senhas.controler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senhas.controler.domain.Index;



@Repository
public interface IndexRepository extends JpaRepository<Index, Integer> {

}
