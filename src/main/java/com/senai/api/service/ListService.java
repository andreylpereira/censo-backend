package com.senai.api.service;

import java.util.List;

import com.senai.api.models.Bairro;
import com.senai.api.models.Pcd;

public interface ListService {

	List<Bairro> listarBairros();
	List<Pcd> listarCenso();
}
