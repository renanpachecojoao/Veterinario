package scr;

public class ControlEndereco {
	Endereco endereco;

	public ControlEndereco() {
		this.endereco = new Endereco();
	
	}//Fim da controle
	
	public ControlEndereco(int codigo, String logradouro, int numero, String bairro, String complemento, String cidade,
			String estado, String uf, long CEP) {
		this.endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
	}//fim do controle com parâmetros//CADASTRAR

}
