import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("insira o número 1-Soma 2-Subtração 3-Multiplicação ou 4-Divisão. ");
		C = sc.nextInt();
		System.out.println("Insira o primeiro número: ");
		A = sc.nextInt();
		System.out.println("Insira o segundo número: ");
		B = sc.nextInt();
		
		
		if (C == 1) {
			System.out.println("O resultado da soma é = " + (A + B ));
		}
		
		else if (C == 2) {
			System.out.println("O resultado da subtração é = " + (A - B));
		}
		
		else if (C == 3) {
			System.out.println("O resultado da multiplicação é = " + (A * B));
		}
		
		else if (C == 4) {
			double d = A;
			double e = B;
			System.out.printf("O resultado da divisão é =  %.2f%n" , (d / e));
		}
		else {
			System.out.println("Por favor informe uma operação válida, sendo 1 para somar, 2 para subtrair, 3 para multiplicar ou 4 para dividir.");
		}
		
		
		sc.close();
		
		
		
		
	}

}


