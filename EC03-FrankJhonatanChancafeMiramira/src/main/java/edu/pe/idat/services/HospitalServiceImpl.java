package edu.pe.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.models.Hospital;
import edu.pe.idat.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository repository;
	
	@Override
	public void guardar(Hospital hospital) {
		repository.save(hospital);
	}

	@Override
	public void actualizar(Hospital hospital) {
		repository.saveAndFlush(hospital);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Hospital> listar() {
		return repository.findAll();
	}

	@Override
	public Hospital obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
