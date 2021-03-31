package br.com.codeless.webservicerest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codeless.webservicerest.dto.rsDTO;

@RestController
@RequestMapping("/api/v1/rs")
public class rsController {
	
	@GetMapping
	public List<rsDTO> getSomething() { 

		rsDTO dto = new rsDTO();

		dto.setNome("Samuel");
		dto.setSobrenome("Verneck");

		return List.of(dto, dto, dto);
	}
}
