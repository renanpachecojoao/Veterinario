package scr;

public class ControlDono {
	Dono dono = new Dono();
	
	
	public ControlDono() {
		this.dono = new Dono();
	}//Fim do controle
	
	
	public ControlDono(int codigo, long cpf, String nome , String telefone, String email, Endereco endereco, Animal animal) {
		this.dono = new Dono(codigo, cpf, nome, telefone, email, endereco, animal);
	}//Fim do controle com parâmetros//CADASTRAR
	
}