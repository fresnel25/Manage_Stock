package org.sid.Gestion_de_Stock.Model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vente")
public class Ventes extends AbstractEntity {

	@Column(name = "Code")
	private String code;
	
	@Column(name = "DateVente")
	private Instant dateVente;
	
	@Column(name = "Commentaire")
	private String commentaire;
}
