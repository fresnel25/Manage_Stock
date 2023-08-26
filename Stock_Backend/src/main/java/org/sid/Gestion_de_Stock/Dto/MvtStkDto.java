package org.sid.Gestion_de_Stock.Dto;

import java.math.BigDecimal;
import java.time.Instant;

import org.sid.Gestion_de_Stock.Model.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStkDto {
	
	private Integer id;

	private Instant dateMvt;
	
	private BigDecimal quantite ;
	
	private ArticleDto article;
	
	private TypeMvtStk typeMvtStk;
}
