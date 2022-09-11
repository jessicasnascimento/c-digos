package br.com.banco;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {

	@Override
	public void imprimeExtrato() {
        System.out.println("### Extrato Conta Corrente ###");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Nome: " +  this.getNome());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
		
	}

}
