package exerciciosJava;

public class Ex2 {
	public static void main (String args[]){
		
		
		System.out.println("Numeros que divididos por 11 ou divididos por 11 com dão resto 5 [1000,1999]");
		
		for (int i = 1000;i<2000;i++){
			if(i%11==5 || i%11==0){
				System.out.println(i);
			}
		}
	}

}
