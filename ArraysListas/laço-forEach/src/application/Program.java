package application;

public class Program {

	public static void main(String[] args) {
		/* Laço "for each"
		 * Sintaxe opcional e simplificada para percorrer coleções
		 * 
		 *  sintaxe:
		 *  
		 *  for(Tipo apelido : coleção){
		 *  <comando1>
		 *  <comando2>
		 *  
		 *  } 
		 */
		
		
		
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		
		for (int i=0;i<vect.length; i++) {
			
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------------------------");
		
		//Usando o For each
		for (String obj : vect) {
			
			System.out.println(obj);
			
		}
		
	}

}
