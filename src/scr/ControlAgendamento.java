package scr;

import java.time.LocalDate;
import java.time.LocalTime;

public class ControlAgendamento {
	Agendamento agendamento = new Agendamento();

	
public ControlAgendamento() {
	this.agendamento = new Agendamento();
}

public ControlAgendamento(int codigo, Animal animal, Dono dono, LocalDate data, LocalTime horario) {
		this.agendamento = new Agendamento(codigo, animal, dono, data, horario);
}

}