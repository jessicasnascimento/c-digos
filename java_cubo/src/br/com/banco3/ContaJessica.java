package br.com.banco3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaJessica extends Conta {

	@Override
	public void imprimeExtrato() {
        System.out.println("### Extrato Conta da Jess ###");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Nome: " + this.getName());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
		
	}

}
