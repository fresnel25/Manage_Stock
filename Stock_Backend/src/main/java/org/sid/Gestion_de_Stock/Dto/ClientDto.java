package org.sid.Gestion_de_Stock.Dto;

import java.util.List;

import org.sid.Gestion_de_Stock.Model.Adresse;

import jakarta.persistence.Embedded;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {
	
	private String nom;
	
	private String prenom;
	
	private AdresseDto adresse;
	
	private String photo;
	
	private String mail;
	
	private String numTel;
	
	private List<CommandeClientDto> commandeClients;

}
