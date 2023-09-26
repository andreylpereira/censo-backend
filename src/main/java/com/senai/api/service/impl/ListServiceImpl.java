package com.senai.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.api.models.Bairro;
import com.senai.api.models.Pcd;
import com.senai.api.repository.BairroRepository;
import com.senai.api.repository.PcdRepository;
import com.senai.api.service.ListService;

@Service
public class ListServiceImpl implements ListService {
	
	@Autowired
	private BairroRepository bairroRepository;
	@Autowired
	private PcdRepository pcdRepository;
	
	@Override
	public List<Bairro> listarBairros() {
		return bairroRepository.findAll();
	}

	@Override
	public List<Pcd> listarCenso() {
		return pcdRepository.findAll();
	}

}
