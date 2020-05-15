package exerciciosJava;
import java.util.Scanner;;

public class Ex5 {
	public static void main(String args[]){
		
		float numero = 0;
		float cont = 0;
		float media;
		float soma = 0;
		Scanner ler = new Scanner(System.in);
		
		while(numero>=0) {
			System.out.print("Digite o numero: ");
			numero = ler.nextFloat();
			
			cont++;
			
			if(numero <0)
				break;
			
			soma = soma + numero;
		}
		
		media = soma/(cont-1);
		
		System.out.println();
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		System.out.println("Interações: " + (cont-1));
		
	}

}
