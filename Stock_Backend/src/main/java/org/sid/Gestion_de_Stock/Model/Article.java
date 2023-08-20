package org.sid.Gestion_de_Stock.Model;

import java.math.BigDecimal;
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
@Table(name = "article")
public class Article extends AbstractEntity {
	
	@Column(name = "CodeArticle")
	private String codeArticle;
	
	@Column(name = "Designation")
	private String designation;
	
	@Column(name = "PrixUnitaireHt")
	private BigDecimal prixUnitaireHt;
	
	@Column(name = "TauxTva" )
	private BigDecimal tauxTva;
	
	@Column(name = "PrixUnitaireTtc")
	private BigDecimal prixUnitaireTtc ;
	
	@Column(name = "Photo")
	private String photo ;
	
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie categorie ;
	
	@OneToMany(mappedBy = "article")
	private List<LigneCommandeClient> ligneCommandeClients;
	
	
}
