package org.sid.Gestion_de_Stock.Dto;

import java.time.Instant;
import java.util.List;

import org.sid.Gestion_de_Stock.Model.Client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDto {
	
	private String code;
	
	private Instant dateCommande;
	
	private Client client;
	
	private List<LigneCommandeClientDto> ligneCommandeClients;

}
