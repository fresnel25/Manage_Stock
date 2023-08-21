package org.sid.Gestion_de_Stock.Model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity {
	
	@ManyToOne
	@JoinColumn(name = "idVente")
	private Ventes vente;
	
	@Column(name = "Quantite")
	private BigDecimal quantite;

	@Column(name = "PrixUnitaire")
	private BigDecimal prixUnitaire;
}
