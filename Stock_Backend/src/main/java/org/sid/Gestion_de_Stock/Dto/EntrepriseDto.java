package org.sid.Gestion_de_Stock.Dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDto {

	private String nom;
	
	private String description;
	
	private AdresseDto adresse;
	
	private String photo;
	
	private String mail;
	
	private String numTel;
	
	private String siteWeb;
	
	private List<UtilisateurDto> utilisateurs;
	
	
}
