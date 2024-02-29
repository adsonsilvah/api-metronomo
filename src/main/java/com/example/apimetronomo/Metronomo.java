package com.example.apimetronomo;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity(name = "metronomos")
public class Metronomo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "bpm")
	private Long bpm;
	
	@Column(name = "url")
	private String URL;
	
}
