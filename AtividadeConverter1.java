package Atividades1004;

import java.util.Scanner;

public class AtividadeConverter1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		double n1 = ler.nextDouble();
		System.out.println("Nota 2: ");
		double n2 = ler.nextDouble();
		System.out.println("Nota 3: ");
		double n3 = ler.nextDouble();
		System.out.println("Nota 4: ");
		double n4 = ler.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		
		String msg = media >= 7 ? "Aprovado" : "Reprovado"; 
		System.out.println(", sua média foi de "+media);
		
		
		
		
		
		
		
		
		
		
		

	}

}
