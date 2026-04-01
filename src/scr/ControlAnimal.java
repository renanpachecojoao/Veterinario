package scr;

public class ControlAnimal {
	Animal animal = new Animal();
	
	public ControlAnimal() {
		this.animal = new Animal();
	}//Fim da controle
	
	public ControlAnimal(int codigo, String nome, String especie,  String raca, int idade, double peso, Dono dono) {
		this.animal = new Animal(codigo, nome, especie, raca, idade, peso, dono);
	}//Fim do controle com parâmetros//CADASTRAR

}
