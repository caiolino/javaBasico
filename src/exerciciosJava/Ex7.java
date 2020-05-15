package exerciciosJava;

public class Ex7 {
	
	public static int fatorial(int n) {
		int resultado = n;
		if(n!=0) {
			while(n>1) {
				resultado = resultado*(n-1);
				n--;
			}
		}else {
			resultado = 1;
		}
		return resultado;
	}

	public static void main(String args[]) {
		
		//para essa questão achei melhor calcular e^x usando expandindo entaylor
		
		
		int n = 25;
		double x=1;
		double e = 0;
		
		for(int i=0; i<n;i++) {
			e = e + Math.pow(x, i)/fatorial(i);
		}
		
		System.out.println("Resultato: e=" + e);
		
	}
			
}
