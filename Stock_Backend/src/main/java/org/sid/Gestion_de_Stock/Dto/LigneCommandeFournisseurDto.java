package org.sid.Gestion_de_Stock.Dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeFournisseurDto {
	
	private Integer id;

	private ArticleDto article;
	
	private CommandeFournisseurDto commandeFournisseur;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
}
