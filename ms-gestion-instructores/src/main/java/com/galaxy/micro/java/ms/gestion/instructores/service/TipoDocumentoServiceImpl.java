package com.galaxy.micro.java.ms.gestion.instructores.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galaxy.micro.java.ms.gestion.instructores.dto.TipoDocumentoDTO;
import com.galaxy.micro.java.ms.gestion.instructores.entity.TipoDocumentoEntity;
import com.galaxy.micro.java.ms.gestion.instructores.repository.TipoDocumentoRepository;
import com.galaxy.micro.java.ms.gestion.instructores.service.exception.ServiceException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

	@Autowired
	private TipoDocumentoRepository repository;

	@Autowired
	private ObjectMapper objectMapper;

	public TipoDocumentoServiceImpl() {
	}

	@Override
	public List<TipoDocumentoDTO> findLike(TipoDocumentoDTO tipoDocumentoDTO) throws ServiceException {
		try {
			return this.repository.getAllCustom().stream().map(e -> this.getTipoDocumentoDTO(e))
					.collect(Collectors.toList());

		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			throw new ServiceException(e2);
		}
	}

	@Override
	public Optional<TipoDocumentoDTO> findById(TipoDocumentoDTO tipoDocumentoDTO) throws ServiceException {
		try {
			return Optional.of(this.getTipoDocumentoDTO(this.repository.findById(tipoDocumentoDTO.getId()).get()));
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			throw new ServiceException(e2);
		}
	}

	@Override
	public TipoDocumentoDTO save(TipoDocumentoDTO tipoDocumentoDTO) throws ServiceException {
		try {
			return this.getTipoDocumentoDTO(this.repository.save(this.getTipoDocumentoEntity(tipoDocumentoDTO)));
		} catch (Exception e2) {
			log.error(e2.getMessage(), e2);
			throw new ServiceException(e2);
		}
	}

	private TipoDocumentoEntity getTipoDocumentoEntity(TipoDocumentoDTO tipoDocumentoDTO) {
		return objectMapper.convertValue(tipoDocumentoDTO, TipoDocumentoEntity.class);
	}

	private TipoDocumentoDTO getTipoDocumentoDTO(TipoDocumentoEntity tipoDocumentoEntity) {
		return objectMapper.convertValue(tipoDocumentoEntity, TipoDocumentoDTO.class);
	}

}
