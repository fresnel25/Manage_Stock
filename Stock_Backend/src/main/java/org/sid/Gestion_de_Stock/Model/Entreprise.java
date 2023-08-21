package org.sid.Gestion_de_Stock.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
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
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity {

	@Column(name = "nom")
	private String nom;
	
	@Column(name = "Description")
	private String description;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name = "Photo")
	private String photo;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "telephone")
	private String numTel;
	
	@Column(name = "SiteWeb")
	private String siteWeb;
	
	@OneToMany(mappedBy = "entreprise")
	private List<Utilisateur> utilisateurs;
	
	
}
