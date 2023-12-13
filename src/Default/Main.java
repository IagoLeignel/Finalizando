package Default;
import java.util.Scanner;

public class Main {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Calculadora de IMC");
	        System.out.print("Digite o peso: ");
	        double peso = scanner.nextDouble();

	        System.out.print("Digite a altura: ");
	        double altura = scanner.nextDouble();

	        double imc = calcularIMC(peso, altura);
	        System.out.println("O IMC é: " + imc);

	        resultadoIMC(imc);

	        scanner.close();
	    }

	    public static double calcularIMC(double peso, double altura) {
	        return peso / (altura * altura);
	    }

	    public static void resultadoIMC(double imc) {
	        if (imc < 18.5) {
	            System.out.println("Abaixo do peso");
	        } else if (imc >= 18.5 && imc < 25) {
	            System.out.println("Peso normal");
	        } else if (imc >= 25 && imc < 30) {
	            System.out.println("Sobrepeso");
	        } else {
	            System.out.println("Obesidade");
	        }
	    }
	}
