package exerciciosJava;

import java.util.Scanner;

public class Ex6 {
	
	public static void cadastro(String sexo[],String temperamento[],int idade[],Scanner ler) {
		for(int i = 0; i < sexo.length; i++) {
			System.out.println("Pessoa: " + (i+1));
			System.out.print("A pessoa é homem ou mulher? ");
			sexo[i] = ler.next().toLowerCase(); 
			System.out.print("Ela esta calma estressada ou agressiva? ");
			temperamento[i] = ler.next().toLowerCase();
			System.out.print("Qual a idade dela? ");
			idade[i] = ler.nextInt();

		}
	}
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int n = 150;
		String sexo[] = new String[n];
		String temperamento[] = new String[n];
		int idade[] = new int[n];
		
		int pCalmas = 0;
		int mNerv = 0;
		int hAgressivo = 0;
		int nervMais40 = 0;
		int calmMenos18 = 0;
		
		cadastro(sexo, temperamento, idade, ler);
				
		for(int i = 0; i < sexo.length; i++) {

			if(temperamento[i].equals("calma")) {
				pCalmas++;
			}
			if(sexo[i].equals("mulher") && temperamento[i].equals("nervosa")) {
				mNerv++;
			}
			if(sexo[i].equals("homem") && temperamento[i].equals("agressiva")) {
				hAgressivo++;
			}
			if(temperamento[i].equals("nervosa") && idade[i]>40) {
				nervMais40++;
			}
			if(temperamento[i].equals("calma") && idade[i]<18) {
				calmMenos18++;
			}
		}
		
		System.out.println("número de pessoas calmas: " + pCalmas);
		System.out.println("número de mulheres nervosas: " + mNerv);
		System.out.println("nnúmero de homens agressivos: " + hAgressivo);
		System.out.println("número de pessoas nervosas com mais de 40 anos: " + nervMais40);
		System.out.println("número de pessoas calmas com menos de 18 anos: " + calmMenos18);
		
	}

}
