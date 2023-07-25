package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		/* Tamanho da Lista: size()
		 * Inserir elemento na lista: add(obj), add(int, obj)
		 * Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
		 * Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
		 * 
		 * Filtrar lista com base em predicado:
		 * 	List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		 * 
		 * Encontrar primeira ocorrência com base em predicado:
		 * 	Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 */
		
		
		List<String> list = new ArrayList<>();
		
		//Adicionando elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//Adicionando elemento em posição especifica na lista
		list.add(2,"Marco");
		
		//Imprimindo tamanho da lista
		System.out.println(list.size());
		
		for(String x : list) {
			
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		
		//Removendo Elementos:
		
		//Removendo elemento a partir da comparação com valores inseridos
		list.remove("Anna");
		
		//Removendo elemento da lista a partir da sua posição
		list.remove(1);
		
		//removendo elemento a partir de predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		
		list.add(0,"Alex");
		
		//Imprimindo valor da posição de um elemento na lista
		System.out.println("Index of Bob:  " + list.indexOf("Bob"));
	}

}
