package q4;

import java.time.LocalDateTime;

public class Servico extends ItemCompravel {
	private LocalDateTime horario;

	public Servico(String nome, float preco) {
		super(nome, preco);
		horario = LocalDateTime.now();		
	}

	public LocalDateTime getHorario() {
		return horario;
	}
	
}
