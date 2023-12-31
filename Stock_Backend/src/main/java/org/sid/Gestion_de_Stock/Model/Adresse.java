package org.sid.Gestion_de_Stock.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Embeddable
public class Adresse {

	@Column(name = "Adresse1")
	private String adresse1;
	
	@Column(name = "Adresse2")
	private String adresse2;
	
	@Column(name = "Ville")
	private String ville;
	
	@Column(name = "CodePostale")
	private String codePostale;
	
	@Column(name = "Pays")
	private String pays;
}
