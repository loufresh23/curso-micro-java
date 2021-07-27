package com.galaxy.micro.java.ms.gestion.instructores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.micro.java.ms.gestion.instructores.dto.TipoDocumentoDTO;
import com.galaxy.micro.java.ms.gestion.instructores.service.TipoDocumentoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/tipo-documentos")
public class TipoDocumentoController {

	@Autowired
	private TipoDocumentoService service;

	@GetMapping
	public ResponseEntity<List<TipoDocumentoDTO>> findLike() {

		try {
			return ResponseEntity.ok(service.findLike(null));
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	@PostMapping
	public ResponseEntity<TipoDocumentoDTO> insert(@RequestBody TipoDocumentoDTO tipoDocumentoDTO) {

		try {
			return ResponseEntity.ok(service.save(tipoDocumentoDTO));
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
