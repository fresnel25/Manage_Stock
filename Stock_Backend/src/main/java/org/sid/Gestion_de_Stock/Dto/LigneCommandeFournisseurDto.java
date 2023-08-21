package org.sid.Gestion_de_Stock.Dto;

import java.math.BigDecimal;

import org.sid.Gestion_de_Stock.Model.Article;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeFournisseurDto {

	private ArticleDto article;
	
	private CommandeFournisseurDto commandeFournisseur;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
}
