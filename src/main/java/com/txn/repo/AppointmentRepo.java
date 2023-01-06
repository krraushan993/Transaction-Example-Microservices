package com.txn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.txn.entity.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

}
