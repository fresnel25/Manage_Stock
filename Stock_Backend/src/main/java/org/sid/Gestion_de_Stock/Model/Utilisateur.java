package org.sid.Gestion_de_Stock.Model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {

	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "DateDeNaissance")
	private Instant dateDeNaissance;
	
	@Column(name = "MotDePasse")
	private String motDePasse;
	
	@Column(name = "telephone")
	private String numTel;
	
	@ManyToOne
	@JoinColumn(name = "idEntreprise")
	private Entreprise entreprise;
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Roles> roles;
	
}
