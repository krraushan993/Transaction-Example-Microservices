package com.txn.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder

public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long appointmentNo;
	private Date date;
	private int doctorNo;
	private Long patientNo;
}
