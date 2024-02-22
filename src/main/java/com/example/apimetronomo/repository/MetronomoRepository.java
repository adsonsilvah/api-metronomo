package com.example.apimetronomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apimetronomo.Metronomo;

@Repository
public interface MetronomoRepository extends JpaRepository<Metronomo, Long>{
	
}
