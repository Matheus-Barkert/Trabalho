package com.trabalho.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data
public class DateInfo {
	
	private String date;
	
	public DateInfo() {
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		this.date = LocalDateTime.now().format(timeFormatter);
	}

}
