package org.sid.Gestion_de_Stock.Dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {

	private String roleName;
	
	private UtilisateurDto utilisateur;
}
