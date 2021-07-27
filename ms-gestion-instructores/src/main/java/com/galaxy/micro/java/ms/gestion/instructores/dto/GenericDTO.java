package com.galaxy.micro.java.ms.gestion.instructores.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class GenericDTO implements Serializable{

	private static final long serialVersionUID = -4095127465639916773L;

	private Integer id;
	
	private String estado = "1";
	
}
