package edu.pe.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.models.UsuarioCliente;
import edu.pe.idat.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {

	@Autowired
	private UsuarioClienteRepository repository;

	@Override
	public void guardar(UsuarioCliente usuariocliente) {
		repository.save(usuariocliente);
	}

	@Override
	public void actualizar(UsuarioCliente hospitalcliente) {
		repository.saveAndFlush(hospitalcliente);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<UsuarioCliente> listar() {
		return repository.findAll();
	}

	@Override
	public UsuarioCliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
