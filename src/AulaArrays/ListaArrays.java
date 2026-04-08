package AulaArrays;
import java.util.Scanner;
public class ListaArrays {
	public static void main(String[] args) {
		exercicio1();
	}
	static void exercicio1() {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Informe um número: ");
			numeros[i] = sc.nextInt();
			sc.close();
		}
		
		System.out.println("");
		System.out.println("Dobro dos números: ");
		for(int i = 0; i < numeros.length; i++) { 
			System.out.println(numeros[i] * 2);
		}
	}
}
