package com.bibhu.first.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.bibhu.first.dto.Reservation;
import com.bibhu.first.dto.ReservationUpdateRequest;
@Component
public class ReservationRestClientImpl implements ReservationClient {

	private static final String requestabc ="http://localhost:2020/lastOne/reservations/" ;
	private Reservation postForObject;

	@Override
	public Reservation findReservation(long id) {
		RestTemplate restTemplate=new RestTemplate();
		System.out.println(" before url "+id);
		Reservation reservation=restTemplate.getForObject(
				requestabc+id,Reservation.class);
		System.out.println(" after url");
		return reservation;
	}

	@Override
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		RestTemplate restTemplate=new RestTemplate();
		System.out.println(request+" //////////////");
		postForObject = restTemplate.postForObject(requestabc+"update", request,Reservation.class);
		return postForObject;
	}

	@Override
	public Reservation updateReservation() {
		
		return null;
	}

}
