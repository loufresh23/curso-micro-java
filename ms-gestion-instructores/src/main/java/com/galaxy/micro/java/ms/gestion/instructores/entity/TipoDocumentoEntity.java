package com.galaxy.micro.java.ms.gestion.instructores.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "Tipo_Documento")
@Entity(name = "TipoDocumentoEntity")
public class TipoDocumentoEntity extends GenericEntity{
	
	private static final long serialVersionUID = 140624918698774968L;

	@Id
	@Column(name = "id_tipo_documento")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTipoDocumento")
	@SequenceGenerator(name = "seqTipoDocumento", sequenceName = "seq_Tipo_Documento", allocationSize = 1)
	private Integer id;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "descripcion_larga")
	private String descripcionLarga;
	
	@Column(name = "descripcion_corta")
	private String descripcionCorta;

}
