package AulaArrays;
import java.util.Scanner;
public class ListaArrays {
	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		exercicio3();
	}
	static void exercicio1() {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Informe um número: ");
			numeros[i] = sc.nextInt();
			
		}
		
		System.out.println("");
		System.out.println("Dobro dos números: ");
		for(int i = 0; i < numeros.length; i++) { 
			System.out.println(numeros[i] * 2);
		}
		sc.close();
	}
	static void exercicio2() {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Informe um número");
			numeros[i] = sc.nextInt();
		}
		System.out.println("\nPar ou Ímpar:");
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
			System.out.println(numeros[i] + " é Par");
		} else {
			System.out.println(numeros[i] + " é Ímpar");
		}
		sc.close();
		}
	}
	static void exercicio3() {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Informe um número entre 1 e 10: ");
			int numero = sc.nextInt();
			while (numero < 1 || numero > 10) {
				System.out.println("NÚMERO INVÁLIDO!");
				System.out.println("Informe outro número: ");
				numero = sc.nextInt();
			}
			numeros[i] = numero;
		}
		System.out.println("\nVetor invertido:");
		for(int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i] + " ");
		}
		sc.close();
	}
}