package scr;

public class Animal {
	
	private int codigo;
	private String nome;
	private String especie;
	private String raca;
	private int idade;
	private double peso;
	Dono dono;//Ligação com o dono
	
	//Construtor Padrão
	public Animal() {
		this.setCodigo(0);
		this.setNome("");
		this.setEspecie("");
		this.setRaca("");
		this.setIdade(0);
		this.setPeso(0.0);
		this.setDono(new Dono());
	}//fim do construtor padrão
	
	//Construtor Animal
	public Animal(int codigo, String nome, String especie, String raca, int idade, double peso, Dono dono) {
	this.setCodigo(codigo);
	this.setNome(nome);
	this.setEspecie(especie);
	this.setRaca(raca);
	this.setIdade(idade);
	this.setPeso(peso);
	this.setDono(dono);
	}//Fim do construtor Animal
	
	
	
	

	public int getCodigo() {
		return codigo;
	}//Fim do get Codigo

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}//Fim do set codigo

	public String getNome() {
		return nome;
	}//Fim do get Nome

	public void setNome(String nome) {
		this.nome = nome;
	}//Fim do set Nome

	public String getEspecie() {
		return especie;
	}//Fim do get Especie

	public void setEspecie(String especie) {
		this.especie = especie;
	}//Fim do set Especie

	public String getRaca() {
		return raca;
	}//Fim do get Raca

	public void setRaca(String raca) {
		this.raca = raca;
	}//Fim do set Raca

	public int getIdade() {
		return idade;
	}//Fim do get Idade

	public void setIdade(int idade) {
		this.idade = idade;
	}//Fim do set Idade
	
	public double getPeso() {
		return peso;
	}//Fim do get Peso
	
	public void setPeso(double peso) {
		this.peso = peso;
	}//Fim do get Peso
	
	public Dono getDono() {
		return dono;
	}//Fim do get Dono

	public void setDono(Dono dono) {
		this.dono = dono;
	}//Fim do set Dono
	
	
	//Método imprimir 
	public String imprimir() {
		return "Código: "  		+ getCodigo()  	+
				"\nNome: "		+ getNome()		+
				"\nEspécie: " 	+ getEspecie() 	+
				"\nRaça: "		+ getRaca()     +
				"\nIdade: "		+ getIdade()	+
				"\nPeso: "		+ getPeso();
		}//fim do método imprimir 
}
