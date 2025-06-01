package exercicios;

import java.util.LinkedList;

public class Exemplo02LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String>dia = new LinkedList<String>();
		
		dia.add("Segunda-Feira");
		dia.add("Terça-Feira");
		dia.add("Quarta-Feira");
		dia.add("Quinta-Feira");
		dia.add("Sexta-Feira");
		dia.add("Sabado");
		dia.add("Domingo");
		System.out.println("Os dias da semana são:"+ dia);

	}

}
