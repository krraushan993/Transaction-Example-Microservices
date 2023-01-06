package com.txn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.txn.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient ,Long>{

}
