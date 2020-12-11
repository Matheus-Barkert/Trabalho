package com.trabalho.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trabalho.model.Dolar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DolarResponse {

	@JsonProperty("USD")
	private Dolar comercial;

	@JsonProperty("USDT")
	private Dolar turismo;

}
