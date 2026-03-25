package scr;

public class Endereco {
	private int codigo;
	private String logradouro;
	private int numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	private String uf;
	private long CEP;
	
	public Endereco () {
		this.setCodigo (0);
		this.setLogradouro("");
		this.setNumero(0);
		this.setBairro("");
		this.setCidade("");
		this.setComplemento ("");
		this.setEstado("");
		this.setuf ("");
		this.setCEP (0);
	}//fim do construtor
	
	public Endereco(int codigo, String logradouro, int numero, String bairro, String complemento, String cidade,
			String estado, String uf, long CEP) {
		
		this.setCodigo (codigo);
		this.setLogradouro  (logradouro);
		this.setNumero  (numero);
		this.setBairro (bairro);
		this.setComplemento ( complemento);
		this.setCidade  (cidade);
		this.setEstado (estado);
		this.setuf  (uf);
		this.setCEP (CEP);
	}//Fim do construtor
	
	public int getCodigo() {
		return this.codigo;
	}//fim do getCodigo
	public String getLogradouro() {
		return this.logradouro;
	}// fim do getlogradouro
	public int getNumero() {
		return this.numero;
	}// fim do getnumero
	public String getBairro() {
		return this.bairro;
	}// fim do getBairro
	public String getComplemento() {
		return this.complemento;
	}// fim do getComplemento
	public String getEstado() {
		return this.estado;
	}// fim do getcomplemento
	public String getuf() {
		return this.uf;
	}// fim do getUF
	public long getCEP() {
		return this.CEP;
	}// fim do getCEP
	public String getCidade() {
		return this.cidade;
	}// fim do getCidade
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}//fim do setCidade
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}//fim do setCodigo
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}//fim do setLogradouro
	public void setNumero(int numero) {
		this.numero = numero;
	}//fim do setNumero
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}//fim do setBairro
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}//fim do setComplemento
	public void setEstado(String estado) {
		this.estado = estado;
	}//fim do setEstado
	public void setuf(String uf) {
		this.uf = uf;
	}//fim do setUF
	public void setCEP(long CEP) {
		this.CEP = CEP;
	}//fim do setCEP 
	
	public String imprimir() {
		return "Logradouro: " 		+ getLogradouro() 	+
				"\nNúmero: " 		+ getNumero() 		+
				"\nBairro: " 		+ getBairro() 		+
				"\nComplemento: " 	+ getComplemento() 	+
				"\nEstado: "		+ getEstado()		+
				"\nCidade: "		+ getCidade()		+
				"\nUF: "			+ getuf()			+
				"\nCEP: "			+ getCEP();
	}//fim da classe imprimir
}//fim da classe

