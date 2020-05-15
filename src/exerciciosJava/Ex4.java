package exerciciosJava;

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		float media;
		boolean validadeGrau = false;
		int cont = 0;
		float grauA = 0;
		float grauB = 0;
		String nome;
		
		while(cont<5) {
			Scanner ler  = new Scanner(System.in);
		    System.out.print("Entre com o nome do aluno:");
		    nome = ler.nextLine();
		    
		    
		    while(validadeGrau == false) {
		    	System.out.print("Entre com o grau A:");
			    grauA = ler.nextFloat();
			    System.out.print("Entre com o grau B:");
			    grauB = ler.nextFloat();
			    if ((grauA < 0 || grauA >10) || (grauB < 0 || grauB >10) ) {
			    	System.out.println("Nota invalida");			    
		    	
			    }else {
			    	validadeGrau = true;
		    	}
			    
		    }
		    media = (grauA + grauB)/2;
		    System.out.print("Media = "+media);
		    System.out.println();
			
		    validadeGrau = false;
		    cont++;
		    
		}
	}


}
