package edu.pe.idat.services;

import java.util.List;

import edu.pe.idat.models.Cliente;

public interface ClienteService {
	void guardar(Cliente cliente);

	void actualizar(Cliente cliente);

	void eliminar(Integer id);

	List<Cliente> listar();

	Cliente obtener(Integer id);
}
