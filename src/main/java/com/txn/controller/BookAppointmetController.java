package com.txn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.txn.controller.dto.AppointmentFormDto;
import com.txn.service.BookAppointmentService;

@RestController
public class BookAppointmetController {

	@Autowired
	private BookAppointmentService bookappointmentService;
	
	@PostMapping("/book")
	public String bookAppointmet(@RequestBody AppointmentFormDto appointmentFormDto) {
		return bookappointmentService.bookAppointment(appointmentFormDto);
	}
}
