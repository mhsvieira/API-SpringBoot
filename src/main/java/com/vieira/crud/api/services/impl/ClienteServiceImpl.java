package com.vieira.crud.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vieira.crud.api.documents.Cliente;
import com.vieira.crud.api.repositories.ClienteRepository;
import com.vieira.crud.api.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired  // instancia classe ClienteRepository de forma automática
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente listarPorId(String id) {
		return this.clienteRepository.findOne(id);
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public void remover(String id) {
		this.clienteRepository.delete(id);
	}

}
