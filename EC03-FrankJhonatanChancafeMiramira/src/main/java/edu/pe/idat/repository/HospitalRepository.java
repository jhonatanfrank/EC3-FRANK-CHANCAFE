package edu.pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.idat.models.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
