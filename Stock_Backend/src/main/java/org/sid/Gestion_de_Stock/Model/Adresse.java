package org.sid.Gestion_de_Stock.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
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
