import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		C = sc.nextInt();
		A = sc.nextInt();
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


