package Lista2;
import java.util.Scanner;
public class Lista2 {
	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		//exercicio6();
		//exercicio7();
		//exercicio8();
		//exercicio9();
		exercicio10();
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
	static void exercicio7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota: ");
		int x = sc.nextInt();
		
		if (x <= 4) {
			System.out.println("Insuficiente");
		} else if (x <= 6) {
			System.out.println("Regular");
		} else if (x <= 8) {
			System.out.println("Bom");
		} else {
			System.out.println("Excelente");
		}
	}
	static void exercicio8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lado 1: ");
		int x = sc.nextInt();
		System.out.println("Lado 2: ");
		int y = sc.nextInt();
		System.out.println("Lado 3: ");
		int z = sc.nextInt();
		
		if (x + y > z && x + z > y && y + z > x) {
			System.out.println("Forma um triangulo");
		} else {
			System.out.println("Nao forma um triangulo");
		}
	}
	static void exercicio9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lado 1: ");
		int x = sc.nextInt();
		System.out.println("Lado 2: ");
		int y = sc.nextInt();
		System.out.println("Lado 3: ");
		int z = sc.nextInt();
		
		if (x == y && x == z) {
			System.out.println("Equilatero");
		} else if (x == y && x != z) {
			System.out.println("Isoceles");
		} else {
			System.out.println("Escaleno");
		}
	}
	static void exercicio10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Usuario: ");
		String usuario1 = sc.nextLine();
		System.out.println("Senha: ");
		String senha1 = sc.nextLine();
		
		String usuario = "Lucas";
		String senha = "1611";
		
		if (usuario1.equals(usuario) && senha1.equals(senha)) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado");
		}
	}
}