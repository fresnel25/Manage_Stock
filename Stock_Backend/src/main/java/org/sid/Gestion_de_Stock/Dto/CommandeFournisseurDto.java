package org.sid.Gestion_de_Stock.Dto;

import java.time.Instant;
import java.util.List;

import org.sid.Gestion_de_Stock.Model.Fournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {
	
	private String code ;
	
	private Instant dateCommande;
	
	private Fournisseur fournisseur;
	
	private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

}
