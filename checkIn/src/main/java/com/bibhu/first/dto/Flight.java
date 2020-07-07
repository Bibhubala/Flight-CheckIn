package com.bibhu.first.dto;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;
@Data
public class Flight {
private Long id;
private String flightNumber;
private String operatingAirline;
private String departureCity;
private String arrivalCity;
private Date dateOfDeparture;
private Timestamp estimatedDepartureTime;

}
