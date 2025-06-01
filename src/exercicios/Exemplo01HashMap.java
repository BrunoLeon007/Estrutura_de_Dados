package exercicios;

import java.util.HashMap;

public class Exemplo01HashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> dados = new HashMap<String, String>();
		
		dados.put("Bruno", "Leonardo");
		dados.put("Natalia", "Regina");
		dados.put("Dan", "Ravi");
		
		System.out.println(dados);

	}

}
