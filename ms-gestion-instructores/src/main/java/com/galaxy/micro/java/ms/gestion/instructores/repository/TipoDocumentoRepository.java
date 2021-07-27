package com.galaxy.micro.java.ms.gestion.instructores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.galaxy.micro.java.ms.gestion.instructores.entity.TipoDocumentoEntity;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Integer> {

	@Query("select p from TipoDocumentoEntity p where p.estado = '1'")
	List<TipoDocumentoEntity> getAllCustom();

}
