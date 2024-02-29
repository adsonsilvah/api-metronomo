package com.example.apimetronomo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apimetronomo.Metronomo;
import com.example.apimetronomo.service.MetronomoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/metronomo")
@RequiredArgsConstructor
public class MetronomoController {
	
	private final MetronomoService metronomoService;

    @GetMapping("/id/{id}")
    public ResponseEntity<Metronomo> findById(@PathVariable("id") Long id) {
        Metronomo entity = metronomoService.findById(id);
        return ResponseEntity.ok(entity);
    }
    
    
    @GetMapping("/bpm/{bpm}")
    public ResponseEntity<Metronomo> findByBpm(@PathVariable("bpm") Long bpm) {
        Metronomo entity = metronomoService.findByBpm(bpm);
        return ResponseEntity.ok(entity);
    }
    
    
}
