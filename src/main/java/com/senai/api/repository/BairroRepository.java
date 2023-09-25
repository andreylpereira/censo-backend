package com.senai.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.api.models.Bairro;

public interface BairroRepository extends JpaRepository<Bairro, Integer> {

}
