package com.bibhu.first.controller;

import javax.ws.rs.FormParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bibhu.first.dto.Reservation;
import com.bibhu.first.dto.ReservationUpdateRequest;
import com.bibhu.first.integration.ReservationClient;

@Controller
public class CheckInController {
	@Autowired
	ReservationClient restClient;

	@GetMapping("/showSartCheckIn")
	public String showStartCheckIn() {
		return "startCheckIn";
	}

	@GetMapping("startCheckIn")
	public String startCheckIn(@FormParam("reservationId") Long reservationId, ModelMap model) {

		Reservation reservation = restClient.findReservation(reservationId);

		model.addAttribute("reservation", reservation);

		return "displayReservationDetails";

	}
	

	@PostMapping("/completeCheckIn")
	public String completeCheckIn(@FormParam("reservationId") Long reservationId,
			@FormParam("numberOfBags") int numberOfBags) {
		System.out.println("Number of Bags:"+numberOfBags);
		ReservationUpdateRequest updaterequest = new ReservationUpdateRequest();
		updaterequest.setId(reservationId);
		updaterequest.setNumberOfBags(numberOfBags);
		updaterequest.setCheckedIn(1);
		restClient.updateReservation(updaterequest);
		return "checkInConformation";
	}
}
