package br.com.spring.teste.spring.teste.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable {

	private Long id;
	private String nome;
	private String cpf;
}
