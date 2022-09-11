package br.com.banco2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrenteTacy extends Conta{

	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato Conta Corrente da Tacy ###");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Nome: " + this.getName());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
		
	}
	

}
