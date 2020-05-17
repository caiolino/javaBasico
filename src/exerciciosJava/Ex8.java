package exerciciosJava;

import java.util.Scanner;

public class Ex8 {
	
	public static void cadastro(float salario[], float nfilhos[],Scanner ler) {
		for(int i = 0; i < salario.length; i++) {
			System.out.println("Pessoa: " + (i+1));
			System.out.print("Qual o salario? ");
			salario[i] = ler.nextFloat(); 
			System.out.print("Quantos filhos? ");
			nfilhos[i] = ler.nextFloat();
			System.out.println();
		}
	}
	
	public static float mediaVetor(float v[]) {
		float soma = 0;
		for(int i = 0; i < v.length; i++) {
			soma = soma +v[i];
		}
		return soma/v.length;
	}
	
	public static float maiorValor(float v[]) {
		float maior = v[0];
		for(int i = 0; i < v.length; i++) {
			if(v[i] >= maior) {
				maior = v[i];
			}
		}
		return maior;
	}
	
	public static float percentual(float v[]) {
		float maisCem = 0;
		for(int i = 0; i < v.length; i++) {
			if(v[i]<=100) {
				maisCem++;
			}
		}
		return (maisCem/v.length)*100;
	}
	
	public static void main(String args[]) {
		
		float salario[] = new float[2];
		float nfilhos[] = new float[2];
		Scanner ler = new Scanner(System.in);
		
		cadastro(salario,nfilhos,ler);
		
		System.out.println("média do salário da população: " + mediaVetor(salario));
		System.out.println("média do número de filhos: " + mediaVetor(nfilhos));
		System.out.println("maior salário: " + maiorValor(salario));
		System.out.println("percentual de pessoas com salário até R$100,00: " + percentual(salario)+ "%");

		
	}

}
