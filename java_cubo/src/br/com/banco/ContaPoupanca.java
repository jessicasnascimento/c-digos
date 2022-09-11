package br.com.banco;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimeExtrato() {
		System.out.println("### Extrato Conta Poupan�a ###");
		
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
		
	}
}
