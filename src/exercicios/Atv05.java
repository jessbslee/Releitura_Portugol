package exercicios;

import java.util.Scanner;

public class Atv05 {

	public static void main(String[] args) {
		Scanner entradas= new Scanner(System.in);
		 
		double n1, n2, n3, p1, p2, p3, media;
		
		System.out.println("Programa: M�dia ponderada. \n\n");
		System.out.println("Insira o valor da primeira nota: ");
		n1 = entradas.nextInt();
		
		System.out.println("Insira o peso da primeira nota: ");
		p1 = entradas.nextInt();
		
		System.out.println("Insira o valor da segunda nota: ");
		n2 = entradas.nextInt();
		
		System.out.println("Insira o pesp da segunda nota: ");
		p2 =entradas.nextInt();
		
		System.out.println("Insira o valor da teceira nota: ");
		p3 =entradas.nextInt();
		
		media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
		System.out.println("A m�dia �: \n", media);
		
		entradas.close();
		
		

	}

}
