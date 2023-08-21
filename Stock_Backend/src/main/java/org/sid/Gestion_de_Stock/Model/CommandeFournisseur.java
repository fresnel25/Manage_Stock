package org.sid.Gestion_de_Stock.Model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "commandefournisseur")
public class CommandeFournisseur extends AbstractEntity {
	
	@Column(name = "Code")
	private String code ;
	
	@Column(name = "DateCommande")
	private Instant dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idFournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy = "commandefournisseur")
	private List <LigneCommandeFournisseur> ligneCommandeFournisseurs;

}
