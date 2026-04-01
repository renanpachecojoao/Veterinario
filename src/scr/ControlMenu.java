package scr;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class ControlMenu {

	Scanner entrada;
	public int opcao;

	int codigo;
	String nome;
	String especie;
	String raca;
	int idade;
	double peso;
	
	long cpf;
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
	public void MostrarMenu() {

		System.out.println("\n\n=== SISTEMA VETERINÁRIO ===" +
						   "\n0. Sair" +
						   "\n1. Cadastrar Dono" +
						   "\n2. Cadastrar Animal" +
						   "\n3. Consultar Animal" +
						   "\n4. Agendar Consulta" +
						   "\n5. Consultar Agendamento");

		this.opcao = Integer.parseInt(entrada.nextLine());
	}

	// =========================
	// EXECUÇÃO
	// =========================
	public void executar() {

		boolean acesso = false;

		// LOGIN ANTES DO MENU
		while (!acesso) {
			acesso = login();
		}

		do {
			this.MostrarMenu();

			switch (this.opcao) {

			case 0:
				System.out.println("Obrigado!");
				break;

			// =========================
			// CADASTRAR DONO
			// =========================
			case 1:
				System.out.println("Cadastrar Dono");
				//Variavel que representa a entrada visivel
				this.entrada = new Scanner (System.in);
				
				System.out.println("Nome:");
				dono.setNome(entrada.nextLine());

				System.out.println("CPF:");
				dono.setCPF(Long.parseLong(entrada.nextLine()));

				System.out.println("Telefone:");
				dono.setTelefone(entrada.nextLine());

				System.out.println("Email:");
				dono.setEmail(entrada.nextLine());
				
				//COLETAR DADOS
				System.out.println("Nome:");
				nome = entrada.nextLine();

				System.out.println("Espécie:");
				especie = entrada.nextLine();

				System.out.println("Raça:");
				raca = entrada.nextLine();

				System.out.println("Idade:");
				idade = Integer.parseInt(entrada.nextLine());

				System.out.println("Peso:");
				peso = Double.parseDouble(entrada.nextLine());
				
				//-coletar endereço
				System.out.println("\nInfome um codigo de endereco: ");
				codigoEndereco = Integer.parseInt(entrada.nextLine());
				
				System.out.println("\nInforme um logradouro: ");
				logradouro = entrada.nextLine();
				
				System.out.println("\nInforme um número:");
				numero = Integer.parseInt(entrada.nextLine());
				
				System.out.println("\nInfome um bairro: ");
				bairro = entrada.nextLine();
				
				System.out.println("\nInforme um complemento: ");
				complemento = entrada.nextLine();
				
				System.out.println("\nInforme uma cidade: ");
				cidade = entrada.nextLine();
				
				System.out.println("\nInforme um estado: ");
				estado = entrada.nextLine();
				
				System.out.println("\nInforme um UF: ");
				uf = entrada.nextLine();
				
				System.out.println("\nInforme um CEP: ");
				CEP = Long.parseLong(entrada.nextLine());
				
				//------CRIAR OBJETO ENDEREÇO PESSOA ANIMAL:
				this.endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
				this.animal = new Animal(codigo, nome, especie, raca, idade, peso, dono);
				this.dono = new Dono(codigo, cpf, nome, telefone, email,endereco);
				System.out.println("Animal cadastrado!");
				break;
				
		

			// =========================
			// CADASTRAR ANIMAL
			// =========================
			case 2:
				System.out.println("Cadastrar Animal");
				//Variavel que representa a entrada visivel
				this.entrada = new Scanner (System.in);
				
				//COLETAR DADOS
				System.out.println("Nome:");
				nome = entrada.nextLine();

				System.out.println("Espécie:");
				especie = entrada.nextLine();

				System.out.println("Raça:");
				raca = entrada.nextLine();

				System.out.println("Idade:");
				idade = Integer.parseInt(entrada.nextLine());

				System.out.println("Peso:");
				peso = Double.parseDouble(entrada.nextLine());
				
				//Cadastrar dono
				System.out.println("Nome Dono:");
				dono.setNome(entrada.nextLine());

				System.out.println("CPF:");
				dono.setCPF(Long.parseLong(entrada.nextLine()));

				System.out.println("Telefone:");
				dono.setTelefone(entrada.nextLine());

				System.out.println("Email:");
				dono.setEmail(entrada.nextLine());
				
				//-coletar endereço
				System.out.println("\nInfome um codigo de endereco: ");
				codigoEndereco = Integer.parseInt(entrada.nextLine());
				
				System.out.println("\nInforme um logradouro: ");
				logradouro = entrada.nextLine();
				
				System.out.println("\nInforme um número:");
				numero = Integer.parseInt(entrada.nextLine());
				
				System.out.println("\nInfome um bairro: ");
				bairro = entrada.nextLine();
				
				System.out.println("\nInforme um complemento: ");
				complemento = entrada.nextLine();
				
				System.out.println("\nInforme uma cidade: ");
				cidade = entrada.nextLine();
				
				System.out.println("\nInforme um estado: ");
				estado = entrada.nextLine();
				
				System.out.println("\nInforme um UF: ");
				uf = entrada.nextLine();
				
				System.out.println("\nInforme um CEP: ");
				CEP = Long.parseLong(entrada.nextLine());

				
				//------CRIAR OBJETO ENDEREÇO PESSOA ANIMAL:
				this.endereco = new Endereco(codigo, logradouro, numero, bairro, complemento, cidade, estado, uf, CEP);
				this.animal = new Animal(codigo, nome, especie, raca, idade, peso, dono);
				System.out.println("Animal cadastrado!");
				break;

			// =========================
			// CONSULTAR ANIMAL
			// =========================
			case 3:
				System.out.println("Consultar Animal");

				if (animal != null) {
					System.out.println(animal.imprimir());
				} else {
					System.out.println("Nenhum animal cadastrado!");
				}
				break;

			// =========================
			// AGENDAR CONSULTA
			// =========================
			case 4:
				System.out.println("Agendar Consulta");

				if (animal == null) {
					System.out.println("Cadastre um animal primeiro!");
					break;
				}

				agendamento = new Agendamento();

				agendamento.setAnimal(animal);
				agendamento.setDono(animal.getDono());

				System.out.println("Ano:");
				int ano = Integer.parseInt(entrada.nextLine());

				System.out.println("Mês:");
				int mes = Integer.parseInt(entrada.nextLine());

				System.out.println("Dia:");
				int dia = Integer.parseInt(entrada.nextLine());

				System.out.println("Hora:");
				int hora = Integer.parseInt(entrada.nextLine());

				System.out.println("Minuto:");
				int minuto = Integer.parseInt(entrada.nextLine());

				agendamento.setData(LocalDate.of(ano, mes, dia));
				agendamento.setHorario(LocalTime.of(hora, minuto));

				System.out.println("Agendamento realizado!");
				break;

			// =========================
			// CONSULTAR AGENDAMENTO 🔥
			// =========================
			case 5:
				System.out.println("Consultar Agendamento");

				if (agendamento != null) {
					System.out.println(agendamento.imprimir());
				} else {
					System.out.println("Nenhum agendamento cadastrado!");
				}
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (this.opcao != 0);
	}
}



