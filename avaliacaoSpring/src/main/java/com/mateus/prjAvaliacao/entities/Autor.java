package com.mateus.prjAvaliacao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@Table(name = "autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_autor;
	 
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "país")
	private String país;
	
	public Long getId_autor() {
		return id_autor;
	}
	public void setId_autor(Long id_autor) {
		this.id_autor = id_autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPaís() {
		return país;
	}
	public void setPaís(String país) {
		this.país = país;
	}

}