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
@Table(name = "mvtstk")
public class MvtStk extends AbstractEntity {
	
	@Column(name = "DateMvt")
	private Instant dateMvt;
	
	@Column(name = "Quantite")
	private BigDecimal quantite ;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@Column(name = "typeMvtStk")
	private TypeMvtStk typeMvtStk;

}
