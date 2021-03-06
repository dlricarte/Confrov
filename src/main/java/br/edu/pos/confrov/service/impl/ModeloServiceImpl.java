package br.edu.pos.confrov.service.impl;

import java.util.List;

import br.edu.pos.confrov.dao.IModeloDAO;
import br.edu.pos.confrov.dao.impl.ModeloDAOImpl;
import br.edu.pos.confrov.entity.Modelo;
import br.edu.pos.confrov.persistence.Dba;
import br.edu.pos.confrov.service.IModeloService;

public class ModeloServiceImpl implements IModeloService {

	private static final long serialVersionUID = 1L;
	
	private IModeloDAO modeloDAO = new ModeloDAOImpl();

	@Override
	public Modelo criaModelo(Modelo modelo) {
		// open transaction  
		Dba dba = new Dba();
		try{
			// createUser 'adopts' the transaction
			modelo = modeloDAO.criaModelo(modelo, dba);
		} finally {
			// 100% sure that the transaction and entity manager will be closed
			dba.closeEm();
		}
		return modelo;
	}

	@Override
	public Modelo findByDescricao(String descricao) {
		// open transaction  
		Dba dba = new Dba();
		Modelo modelo;
		try{
			modelo = modeloDAO.findByDescricao(descricao);
		} finally {
			dba.closeEm();
		}
		return modelo;
	}

	@Override
	public Modelo findById(Long id) {
		Dba dba = new Dba();
		Modelo modelo;
		try{
			modelo = modeloDAO.findById(id);
		} finally {
			dba.closeEm();
		}
		return modelo;
	}

	@Override
	public List<Modelo> findByAll() {
		Dba dba = new Dba();
		List<Modelo> modelos;
		try {
			modelos = modeloDAO.findByAll();
		} finally {
			dba.closeEm();
		}

		return modelos;
	}


	@Override
	public Modelo editaModelo(Modelo modelo) {
		return modelo = modeloDAO.editaModelo(modelo);
	}

}
