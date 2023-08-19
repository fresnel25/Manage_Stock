package org.sid.Gestion_de_Stock.Model;

import java.io.Serializable;
import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@CreatedDate
	@Column(name = "creationDate", nullable = false)
	@JsonIgnore // ce décorateur permet de ne pas afficher l'attribut ci-dessous lors des tests sous format Json
	private Instant creationDate;
	
	@LastModifiedDate
	@Column(name = "modificationDate", nullable = false)
	@JsonIgnore // ce décorateur permet de ne pas afficher l'attribut ci-dessous lors des tests sous format Json
	private Instant modificationDate;

}
