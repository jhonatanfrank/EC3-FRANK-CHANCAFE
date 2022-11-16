package edu.pe.idat.services;

import java.util.List;

import edu.pe.idat.models.UsuarioCliente;

public interface UsuarioClienteService {
	void guardar(UsuarioCliente hospitalcliente);

	void actualizar(UsuarioCliente hospitalcliente);

	void eliminar(Integer id);

	List<UsuarioCliente> listar();

	UsuarioCliente obtener(Integer id);
}
