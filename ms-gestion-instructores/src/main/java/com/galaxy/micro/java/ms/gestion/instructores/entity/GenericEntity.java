package com.galaxy.micro.java.ms.gestion.instructores.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class GenericEntity implements Serializable{

	private static final long serialVersionUID = -4095127465639916773L;

	@Column(name = "estado")
	private String estado = "1";
	
}
