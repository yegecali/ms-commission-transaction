package com.nttdata.mscommissiontransactions.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DateStartAndFinishDto {
	private LocalDateTime startDate;
	private LocalDateTime finishDate;

}
