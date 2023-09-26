package com.senai.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.api.models.Pcd;

public interface PcdRepository extends JpaRepository<Pcd, Integer> {
}
