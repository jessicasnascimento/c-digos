package dados;

import java.util.Date;

public class Agenda {

	private static String descricaoCirurgia;
	private String nomeMedico;
	private static String paciente;
	private static Date dataCirurgia;

	public Agenda() {

	}

	public Agenda(String descricaoCirurgia, String nomeMedico, String paciente, Date dataCirurgia) {
		super();
		Agenda.descricaoCirurgia = descricaoCirurgia;
		this.nomeMedico = nomeMedico;
		Agenda.paciente = paciente;
		Agenda.dataCirurgia = dataCirurgia;
	}

	public static String getDescricaoCirurgia() {
		return descricaoCirurgia;
	}

	public void setDescricaoCirurgia(String descricaoCirurgia) {
		Agenda.descricaoCirurgia = descricaoCirurgia;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public static String getPacienteString() {
		return paciente;
	}

	public void setPacienteString(String pacienteString) {
		Agenda.paciente = pacienteString;
	}

	public static Date getDataCirurgia() {
		return dataCirurgia;
	}

	public void setDataCirurgia(Date dataCirurgia) {
		Agenda.dataCirurgia = dataCirurgia;
	}

	
}
