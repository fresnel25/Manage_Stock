package org.sid.Gestion_de_Stock.Dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
	
	private Integer id;

	private String nom;
	
	private String prenom;

	private AdresseDto adresse;
	
	private String photo;
	
	private String mail;
	
	private Instant dateDeNaissance;
	
	private String motDePasse;
	
	private String numTel;
	
	private EntrepriseDto entreprise;
	
	private List<RoleDto> roles;
}
