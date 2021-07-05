package br.com.alura.bytebank;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class ContaTesteJarLibr {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 321);
		
		
		cc.deposita(200);
		try {
			cc.saca(100);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}

	}

}
