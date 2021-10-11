
public class ImpostoRenda {

	public static void main(String[] args) {

        double salario = 3000.0;
        
        
        if (salario >=  1900.0 && salario <= 2800.0) {
        	salario = salario - 142.0;
        	System.out.println("o IR é de 7.5% e Salario " + salario);
      
        } else if  (salario >=  2800.01 && salario <= 3751.0) {
        	salario = salario - 350.0;
             	System.out.println("o IR é de 15% e Salario " + salario);
        
        	 } else if (salario >=  3751.01 && salario <= 4664.00) {
        		 salario = salario - 636;
        		 System.out.println("o IR é de 22.5% e Salario " + salario);
         	 }
        	 else {
        		 System.out.println("Salario acima do permitido " + salario);
        	 }
	}
	
}    	
	

