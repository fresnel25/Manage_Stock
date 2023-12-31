package org.sid.Gestion_de_Stock.Dto;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDto {
	
	private Integer id;

	private String code;
	
	private Instant dateVente;
	
	private String commentaire;
}
