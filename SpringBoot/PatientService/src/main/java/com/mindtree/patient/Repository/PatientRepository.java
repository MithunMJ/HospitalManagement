package com.mindtree.patient.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.patient.entity.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Integer>
{

}
