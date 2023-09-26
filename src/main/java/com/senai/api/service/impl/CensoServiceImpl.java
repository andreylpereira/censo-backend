package com.senai.api.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.senai.api.dto.PcdDto;
import com.senai.api.models.Bairro;
import com.senai.api.models.Pcd;
import com.senai.api.models.Usuario;
import com.senai.api.repository.BairroRepository;
import com.senai.api.repository.PcdRepository;
import com.senai.api.repository.UsuarioRepository;
import com.senai.api.service.CensoService;

@Service
public class CensoServiceImpl implements CensoService {

	private PcdRepository pcdRepository;
	private BairroRepository bairroRepository;
	private UsuarioRepository usuarioRepository;

	public CensoServiceImpl(PcdRepository pcdRepository, BairroRepository bairroRepository,
			UsuarioRepository usuarioRepository) {
		this.pcdRepository = pcdRepository;
		this.bairroRepository = bairroRepository;
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public ResponseEntity<?> cadastrar(int usuario_id, int bairro_id, PcdDto pcdDto) {
		Usuario criador = new Usuario();
		Optional<Bairro> bairroOptional = bairroRepository.findById(bairro_id);
		Bairro bairro = bairroOptional.get();

		Pcd pcd = new Pcd();
		BeanUtils.copyProperties(pcdDto, pcd);

		criador.setId(usuario_id);
		pcd.setBairro(bairro);
		pcd.setUsuarioCriador(criador);
		pcd.setUsuarioEditor(criador);
		pcd.setCriacaoCenso(LocalDateTime.now());
		pcd.setEdicaoCenso(LocalDateTime.now());

		pcdRepository.save(pcd);
		return ResponseEntity.ok("Cadastrado com sucesso!");
	}

	@Override
	public ResponseEntity<?> atualizar(int usuario_id, int bairro_id, int pcd_id, PcdDto pcdDto) {

		try {
			Usuario editor = new Usuario();
			editor.setId(usuario_id);

			Optional<Pcd> bancoPcd = pcdRepository.findById(pcd_id);

			Optional<Bairro> bairroOptional = bairroRepository.findById(bairro_id);
			Bairro bairro = bairroOptional.get();

			Optional<Usuario> usuarioOptional = usuarioRepository.findById(bancoPcd.get().getUsuarioCriador().getId());
			Usuario criador = usuarioOptional.get();

			Pcd atualizadoPcd = new Pcd();
			BeanUtils.copyProperties(pcdDto, atualizadoPcd);

			if (bancoPcd.isPresent() && bairroOptional.isPresent() && usuarioOptional.isPresent()) {
				atualizadoPcd.setId(bancoPcd.get().getId());
				atualizadoPcd.setDataNascimento(pcdDto.getDataNascimento());
				atualizadoPcd.setCriacaoCenso(bancoPcd.get().getCriacaoCenso());
				atualizadoPcd.setUsuarioEditor(bancoPcd.get().getUsuarioEditor());
				atualizadoPcd.setUsuarioCriador(criador);
				atualizadoPcd.setBairro(bairro);
				atualizadoPcd.setUsuarioEditor(editor);
				atualizadoPcd.setEdicaoCenso(LocalDateTime.now());

				pcdRepository.save(atualizadoPcd);
				return ResponseEntity.ok("Atualizado com sucesso!");
			}
		} catch (Exception e) {
			return ResponseEntity.ok("Não foi possivel atualizar");

		}
		return ResponseEntity.ok("Não foi possivel atualizar");
	}

}
