package Lista2;
import java.util.Scanner;
public class Lista2 {
	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		exercicio6();
	}
	// Nível Básico: 
	static void exercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("O numero é impar");
		}
	}
	static void exercicio2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int x = sc.nextInt();
		
		System.out.println("Numero 2: ");
		int y = sc.nextInt();
		
		if (x > y) {
			System.out.println(x + " é maior");
		} else {
			System.out.println(y + " é maior");
		}
	}
	static void exercicio3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero: ");
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("Positivo");
		} else if (x < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Igual a 0");
		}
	}
	static void exercicio4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota: ");
		int x = sc.nextInt();
		
		if (x >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
	static void exercicio5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade: ");
		int x = sc.nextInt();
		
		if (x >= 16) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Nao pode votar");
		}
	}
	// Nível Intermediário: 
	static void exercicio6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int x = sc.nextInt();
		System.out.println("Numero 2: ");
		int y = sc.nextInt();
		System.out.println("Numero 3: ");
		int z = sc.nextInt();
		
		if (x > y && x > z) {
			System.out.println("O numero 1 é o maior");
		} else if ( x < y && y > z) {
			System.out.println("O numero 2 é o maior");
		} else {
			System.out.println("O numero 3 é o maior");
		}
	}
}