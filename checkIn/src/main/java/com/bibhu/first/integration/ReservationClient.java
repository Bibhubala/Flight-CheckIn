package com.bibhu.first.integration;

import com.bibhu.first.dto.Reservation;
import com.bibhu.first.dto.ReservationUpdateRequest;

public interface ReservationClient {
public Reservation findReservation(long id);
public Reservation updateReservation();
Reservation updateReservation(ReservationUpdateRequest request);
}
