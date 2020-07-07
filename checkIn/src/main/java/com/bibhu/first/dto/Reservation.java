package com.bibhu.first.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Reservation {
private Long id;
private int checkIn;
private int numberOfBags;
private Passenger passenger;
private Flight flight;
private Timestamp created;
}
