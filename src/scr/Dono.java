package scr;

public class Dono {
	//1º Máxima do 0.0 = Encapsulamento
	private int codigo;
	private long cpf;
	private String nome;
	private String telefone; 
	private String email;
	Endereco endereco;
	Animal animal;
	
	
	public Dono() {
		this.setCodigo (0);
		this.setCPF(0);
		this.setNome  ("");
		this.setTelefone("");
		this.setEmail ("");
		this.setEndereco  (new Endereco());//Chamando construtor vazio - com valores padrões 
		this.setAnimal(new Animal());//chamando construtor vazio - com valores padrões 
	}//fim do construtor padrão


	//2º Máxima da O.O = Sopbrecarga
	public Dono(int codigo, long cpf, String nome, String telefone, String email, Endereco endereco, Animal animal) {
		this.setCodigo (codigo);
		this.setCPF (cpf);
		this.setNome (nome);
		this.setTelefone (telefone);
		this.setEmail  (email);
		this.setEndereco (endereco);//Logradouro, numero, bairro, cidade, estado, UF, CEP
		this.setAnimal(animal);//Codigo, nome, especie, raça, idade, peso
	}//fim do construtor pessoa
	
	//Métodos modificadores
	public int getCodigo() {
		return this.codigo;
	}//fim do getcodigo
	public long getCPF() {
		return this.cpf;
	}//fim do getTelefone
	public String getNome() {
		return this.nome;
	}//fim do getTelefone
	public String getTelefone() {
		return this.telefone;
	}//fim do getTelefone
	public String getEmail() {
		return this.email;
	}//fim do getEmail
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}// fim do setCodigo
	public void setCPF(long cpf) {
		this.cpf = cpf;
	}//fim do setCPF
	public void setNome(String nome){
		this.nome = nome;
	}//fim do setNome
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}// fim do setTelefone
	public void setEmail(String email) {
		this.email = email;
	}//fim do setEmail
	
	public Endereco getEndereco() {
		return this.endereco;
	}//fim do getEndereco
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}//fim do setEndereco 

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public String imprimir() {
		return "Codigo: " 		+ getCodigo() 	+
				"\nCPF: " 		+ getCPF() 		+
				"\nNome: " 		+ getNome()		+
				"\nTelefone: " 	+ getTelefone() +
				"\nEmail: " 	+ getEmail()    +
				"\nDados Endereço: " 			+ this.endereco.imprimir() +
				"\nDados Animal:"				+this.animal.imprimir();
	}//fim do imprimir
	
}
