package com.victor.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.victor.crud.entities.Empresa;
import com.victor.crud.repositories.EmpresaRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public void run(String... args) throws Exception {

		
		Empresa p1 = new Empresa(null, "Empresa de Copos", "44.772.937/0005-84", "copos@industria.com");
		Empresa p2 = new Empresa(null, "Empresa de Pratos", "44.556.231/0003-84", "pratos@industria.com");
		Empresa p3 = new Empresa(null, "Empresa de Facas", "44.998.937/0005-84", "facas@industria.com");

		empresaRepository.saveAll(Arrays.asList(p1, p2, p3));

	}
}