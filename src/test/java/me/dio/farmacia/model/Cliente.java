package me.dio.farmacia.model;

import jakarta.persistence.*;

	
@Entity
public class Cliente {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private String cpf;
	    private String endereco;
	    private String telefone;
	    private String cep;
	    private double valorCompras;
	    private double saldoCashback;
	    

	    // Getters e Setters
	    
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public double getValorCompras() {
			return valorCompras;
		}
		public void setValorCompras(double valorCompras) {
			this.valorCompras = valorCompras;
		}
		public double getSaldoCashback() {
			return saldoCashback;
		}
		public void setSaldoCashback(double saldoCashback) {
			this.saldoCashback = saldoCashback;
		}

	    

}
