package com.vieira.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vieira.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
 // as operações do crud não serão implementadas aqui porque já estão herdando de MongoRepository
 // mas se houver a necessidade de implementar uma ação diferente, especializada, é aqui que devemos fazer
	
}
