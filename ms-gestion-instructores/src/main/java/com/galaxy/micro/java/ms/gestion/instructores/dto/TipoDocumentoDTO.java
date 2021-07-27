package com.galaxy.micro.java.ms.gestion.instructores.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class TipoDocumentoDTO extends GenericDTO{
	
	private static final long serialVersionUID = 140624918698774968L;

	private String tipo;
	
	private String descripcionLarga;
	
	private String descripcionCorta;

}
