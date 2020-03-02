package idade;

public class Main {

	public static void main(String[] args) {
		int soma=0; 
		int idade = 15;
		 
		System.out.println("A idade é:"+ idade + "anos");
		
		soma = (idade + 5)*2;
		System.out.println("Resultado 1: "+ soma);
		soma = soma -5;
		System.out.println("Resultado 2: "+ soma);
		
		if(soma >20) {
			System.out.println("A idade é maior que 20");
		}else {
			System.out.println("A idade é menor que 20");
		}

	}

}
