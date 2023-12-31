package org.sid.Gestion_de_Stock.Dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDto {
	
	private Integer id;

	private VentesDto vente;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;

}
