import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		//String operador;
		
		//operador = sc.next();
		//use a primeira posição (C) para indormar a operação que são respectivamente 1 para somar e 2 para subtrair.
		
		C = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		
		//System.out.printf("o resultado é " + operador);
		
		
		
		if (C == 1) {
			System.out.printf("A soma é " + (A + B ));
		}
		
		else if (C == 2) {
			System.out.println("A subtração é " + (A - B));
		}
		
		else {
			System.out.println("Por favor informe uma operação");
		}
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}


