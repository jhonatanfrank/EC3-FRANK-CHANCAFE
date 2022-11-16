package edu.pe.idat.services;

import java.util.List;

import edu.pe.idat.models.Hospital;

public interface HospitalService {
	void guardar(Hospital hospital);

	void actualizar(Hospital hospital);

	void eliminar(Integer id);

	List<Hospital> listar();

	Hospital obtener(Integer id);
}
