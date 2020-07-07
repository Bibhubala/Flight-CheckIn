package com.bibhu.first.dto;

import lombok.Data;

@Data
public class ReservationUpdateRequest {
private Long id;
private int checkedIn;
private int numberOfBags;
}
