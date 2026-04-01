package scr;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ControlMenu {
	Scanner entrada;
	int codigo;
	long CPF;
	public String nome;
	public String especie;
	public String raca;
	public int idade;
	double peso;
	
	public int opcao;
	
	public String telefone; 
	public String email;

	Endereco endereco;
	Dono dono;
	Animal animal;
	Agendamento agendamento;
	
	public int codigoEndereco;
	public String logradouro;
	public int numero;
	public String bairro;
	public String complemento;
	public String cidade;
	public String estado;
	public String uf; 
	public long CEP;
	
	public LocalDate data;
	public  LocalTime horario;

	public ControlMenu() {
		this.entrada = new Scanner(System.in);
		this.opcao = 0;
	}

	// =========================
	// LOGIN
	// =========================
	public boolean login() {

		String usuarioCorreto = "admin";
		String senhaCorreta = "123";

		System.out.println("=== LOGIN ===");

		System.out.print("Usuário: ");
		String usuario = entrada.nextLine();

		System.out.print("Senha: ");
		String senha = entrada.nextLine();

		if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
			System.out.println("Login realizado com sucesso!");
			return true;
		} else {
			System.out.println("Usuário ou senha incorretos!");
			return false;
		}
	}

	// =========================
	// MENU
	// =========================
	public void mostrarMenu() {

		System.out.println("\n=== SISTEMA VETERINÁRIO ===\n\n" 	+
				"\n0 - Sair"									+
				"\n1 - Cadastrar Dono e Animal"					+
				"\n2 - Consultar Animal"						+
				"\n3 - Agendar Consulta"						+
				"\n4 - Consultar Agendamento"					+
				"\n5 - Atualizar Pessoa"						+
				"\n6 - Excluir Dono e Animal ");
		
		System.out.print("Opção: ");
		opcao = Integer.parseInt(entrada.nextLine());
	}

	// =========================
	// EXECUÇÃO
	// =========================
	public void executar() {

		boolean acesso = false;

		while (!acesso) {
			acesso = login();
		}

		do {

			mostrarMenu();

			switch (opcao) {

			case 0:
				System.out.println("Obrigado!");
				break;

			// =========================
			// CADASTRAR DONO + ANIMAL
			// =========================
			case 1:

				System.out.println("\n=== CADASTRAR DONO E ANIMAL ===");

				// DONO
				System.out.print("Código do dono: ");
				codigo = Integer.parseInt(entrada.nextLine());

				System.out.print("Nome do dono: ");
				nome = entrada.nextLine();

				System.out.print("CPF: ");
				CPF = Long.parseLong(entrada.nextLine());

				System.out.print("Telefone: ");
				telefone = entrada.nextLine();

				System.out.print("Email: ");
				email = entrada.nextLine();

				// ENDEREÇO
				System.out.println("\n--- Endereço do Dono ---");

				System.out.print("Código do endereço: ");
				int codigo = Integer.parseInt(entrada.nextLine());

				System.out.print("Logradouro: ");
				logradouro = entrada.nextLine();

				System.out.print("Número: ");
				numero = Integer.parseInt(entrada.nextLine());

				System.out.print("Bairro: ");
				bairro = entrada.nextLine();

				System.out.print("Complemento: ");
				complemento = entrada.nextLine();

				System.out.print("Cidade: ");
				cidade = entrada.nextLine();

				System.out.print("Estado: ");
				estado = entrada.nextLine();

				System.out.print("UF: ");
				uf = entrada.nextLine();

				System.out.print("CEP: ");
				CEP = Long.parseLong(entrada.nextLine());

				// cria o dono primeiro
			
				// ANIMAL
				System.out.println("\n--- Dados do Animal ---");

				System.out.print("Código do animal: ");
				codigo = Integer.parseInt(entrada.nextLine());

				System.out.print("Nome do animal: ");
				nome = entrada.nextLine();

				System.out.print("Espécie: ");
				especie = entrada.nextLine();

				System.out.print("Raça: ");
				raca = entrada.nextLine();

				System.out.print("Idade: ");
				idade = Integer.parseInt(entrada.nextLine());

				System.out.print("Peso: ");
				peso = Double.parseDouble(entrada.nextLine());


				this.endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
				this.animal  = new Animal(codigo, nome, especie, raca, idade, peso, dono);
				this.dono = new Dono(codigo, CPF, nome, telefone, email, endereco, animal);
				
				
				break;

			// =========================
			// CONSULTAR ANIMAL
			// =========================
			case 2:

				//---MOSTRAR O RESULTADO DOS DADOS
				System.out.println(this.dono.imprimir());//mostrar dados
				break;

				
				
			// =========================
			// AGENDAR CONSULTA
			// =========================
			
			case 3:

				System.out.println("\n=== AGENDAR CONSULTA ===");

				if (animal == null) {
					System.out.println("Cadastre um animal primeiro!");
					break;
				}

				  System.out.print("Código do agendamento: ");
				   codigo = Integer.parseInt(entrada.nextLine());

				    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

				    System.out.print("Data da consulta (dd/MM/yyyy): ");
				    data = LocalDate.parse(entrada.nextLine(), formatoData);

				    System.out.print("Horário da consulta (HH:mm): ");
				    horario = LocalTime.parse(entrada.nextLine(), formatoHora);
				    
				    
				    this.agendamento = new Agendamento(codigo, animal, dono, data, horario);				
				    break;

			// =========================
			// CONSULTAR AGENDAMENTO
			// =========================
			case 4:

				System.out.println("\n=== CONSULTAR AGENDAMENTO ===");

				if (agendamento != null) {
					System.out.println(agendamento.imprimir());
				} else {
					System.out.println("Nenhum agendamento cadastrado!");
				}
				break;
				
			case 5 :
				System.out.println("Atualizar!");
				
				System.out.println("Escolha abaixo o que deseja atualizar: " 	 +
									"\n1.Nome"									 +
									"\n2.CPF"									 +
									"\n3.Telefone"							 	 +
									"\n4.E-mail"								 +
									"\n5.Logradouro"							 +
									"\n6.Número"								 +
									"\n7.Bairro"								 +
									"\n8.Complemento"							 +
									"\n9.Cidade"								 +
									"\n10.Estado"								 +
									"\n11.UF"									 +
									"\n12.CEP"									 +
									"\n13.Peso");
				this.opcao = Integer.parseInt(this.entrada.nextLine());
				//Escolha caso para atualização
				switch(this.opcao) {
				case 1:
					System.out.println("Qual o novo nome?");
					String nome = this.entrada.nextLine();//coletando o novo do usuario
					this.dono.setNome(nome);
					break;
					
				case 2:
					System.out.println("Qual o novo CPF?");
					String CPF = this.entrada.nextLine();//Coletando o novo CPF
					this.dono.setCPF(Long.parseLong(CPF));
					break;
					
				case 3:
					System.out.println("Qual o novo Telefone?");
					String telefone = this.entrada.nextLine();//Coletando o novo Telefone
					this.dono.setTelefone(telefone);
					break;
					
				case 4:
					System.out.println("Qual o novo E-mail?");
					String email = this.entrada.nextLine();//Coletando o novo E-mail
					this.dono.setEmail(email);
					break;
					
				case 5:
					System.out.println("Qual o novo Logradouro?");
					String logradouro = this.entrada.nextLine();//Coletando o Novo logradouro
					this.endereco.setLogradouro(logradouro);
					break;
					
					
				case 6:
					System.out.println("Qual o novo Número?");
					int numero = Integer.parseInt(this.entrada.nextLine());//Coletando o novo Número
					this.endereco.setNumero(numero);
					break;
					
				case 7:
					System.out.println("Qual o novo Bairro?");
					String bairro = this.entrada.nextLine();//Coletando o novo bairro
					this.endereco.setBairro(bairro);
					break;
					
				case 8:
					System.out.println("Qual o novo Complemento?");
					String complemento = this.entrada.nextLine();//Coletando o novo Complemento
					this.endereco.setComplemento(complemento);
					break;
				
				case 9:
					System.out.println("Qual a nova Cidade?");
					String cidade = this.entrada.nextLine();//Coletando a nova Cidade
					this.endereco.setCidade(cidade);
					break;
				
				case 10:
					System.out.println("Qual o novo Estado?");
					String estado = this.entrada.nextLine();//Coletando o novo Estado
					this.endereco.setEstado(estado);
					break;
					
				case 11:
					System.out.println("Qual o novo UF?");
					String uf = this.entrada.nextLine();//Coletando o novo UF
					this.endereco.setuf(uf);
					break;
					
				case 12:
					System.out.println("Qual o novo CEP?");
					Long CEP = Long.parseLong(this.entrada.nextLine());//Qual o novo CEP
					this.endereco.setCEP(CEP);
					break;

				case 13:
				    System.out.println("Qual o novo peso?");
				    double peso = Double.parseDouble(this.entrada.nextLine());
				    this.animal.setPeso(peso);
				break;
				
				default:
					System.out.println("Codigo informado inválido!");//Informa o codigo invalido!
					break;
			}

			case 6 :
				System.out.println("Deletar!");
				this.endereco = new Endereco();//Chamando o construtor vazio
				this.dono = new Dono();//Chamando o construtor vazio
				break;
				
			default:
				System.out.println("Código informado inválido!");
				break;
			}

		} while (opcao != 0);
		
		}
		
	}