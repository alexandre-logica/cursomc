package com.aferreiras.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aferreiras.cursomc.domain.Pedido;
import com.aferreiras.cursomc.repositories.PedidoRepository;
import com.aferreiras.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id:" + id
					+", Tipo: " + Pedido.class.getName());
		}
		return obj;
	}
}
