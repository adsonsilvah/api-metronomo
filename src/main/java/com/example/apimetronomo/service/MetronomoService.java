package com.example.apimetronomo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.apimetronomo.Metronomo;
import com.example.apimetronomo.repository.MetronomoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MetronomoService {

	
	public final MetronomoRepository metronomoRepository;
	
	public List<Metronomo> findAll() {
		return metronomoRepository.findAll();
	}
	
	public Metronomo findById(Long id) {
		return metronomoRepository.findById(id).get();
	}
	
	/*
	public Metronomo findByBpm(Long bpm) {
		return metronomoRepository.findBy
	}
	*/
}
