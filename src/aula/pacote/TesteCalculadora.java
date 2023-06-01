package aula.pacote;

import aula_pacote.calculo.Calculadora;
import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float num1 = 0, num2 = 0;
		
		System.out.println("Digite o primeiro numero");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o primeiro numero");
		num2 = leia.nextFloat();
		
		System.out.println("Resultado da soma : " + Calculadora.soma(num1,num2));
		System.out.println("Resultado da subtração : " + Calculadora.subtração(num1,num2));
		System.out.println("Resultado da multiplicação : "+ Calculadora.multiplicacao(num1,num2));
		System.out.println("Resultado da divisão : "+Calculadora.divisao(num1,num2));
		leia.close();

	}

}
