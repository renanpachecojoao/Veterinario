package scr;

import java.time.*;

public class Agendamento {
	private int codigo;
	private Animal animal;
	private Dono dono;
	private LocalDate data;
	private  LocalTime horario;
	
	//Construtor padrão
	public Agendamento() {
		this.setCodigo(0); 
		this.setAnimal(new Animal());
		this.setDono(new Dono());
		this.setData(LocalDate.now());
		this.setHorario(LocalTime.now());
		
	}//Fim do construtor
	
	//Construtor completo
	public Agendamento(int codigo, Animal animal, Dono dono, LocalDate data, LocalTime horario) {
		this.setCodigo(codigo);
		this.setAnimal(animal);
		this.setDono(dono);
		this.setData(data);
		this.setHorario(horario);
		
	}//Fim do construtor
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getHorario() {
		return horario;
	}
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	};

	//Método imprimir 
	public String imprimir() {
		return "\nCódigo: " 	+  getCodigo() 				+
				"\nData: "		+  getData() 	  			+
				"\nHorário: "	+  getHorario()				+
				"\nAnimal: "	+  this.animal.imprimir() 	+ 
				"\nDono: "		+  this.dono.imprimir();
				
	}
}
