package com.senai.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.api.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	Optional<Usuario> findByCpf(String cpf);

}
