package org.sid.Gestion_de_Stock.Dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorieDto {
	
	private String code;
	
	private String designation;
	
	private List<ArticleDto> articles;

}
