package br.com.spring.teste.spring.teste.enums;

import lombok.Getter;

@Getter
public enum PerfilUsuario {
	ADMINISTRADOR(0), COLABORADOR(1);

	private final int idPerfil;

	PerfilUsuario(int id) {
		idPerfil = id;
	}
	
}
