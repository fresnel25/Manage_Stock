package org.sid.Gestion_de_Stock.Dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDto {

	private Integer id;
	
	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaireHt;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitaireTtc ;
	
	private String photo ;
	
	private CategorieDto categorie ;
	
	// private List<LigneCommandeClient> ligneCommandeClients;
	
	
}
