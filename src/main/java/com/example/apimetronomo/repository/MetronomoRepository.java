package com.example.apimetronomo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.apimetronomo.Metronomo;

@Repository
public interface MetronomoRepository extends JpaRepository<Metronomo, Long>{

	@Query("SELECT c FROM metronomos c WHERE c.bpm =:bpm")
	Optional<Metronomo> findByBpm(@Param("bpm") Long bpm);
	
}
