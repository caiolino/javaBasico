package exerciciosJava;

public class Ex1 {
	
	public static void main (String args[]){
			
		int soma = 0;
			
		for (int i = 1;i<501;i++){
			if(i%3==0 && i%2==0){
				soma = soma + i;
			}
		}
		System.out.println("Soma dos Impares Multiplos de 3 em [1,500]");
		System.out.println("Soma = "+soma);

	}

}
