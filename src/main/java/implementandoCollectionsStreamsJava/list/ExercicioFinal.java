package implementandoCollectionsStreamsJava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioFinal {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		//System.out.println(nomes);
		nomes.set(nomes.indexOf("Carlos"), "Roberto");
		//System.out.println(nomes);
		
		System.out.println("Posição 1: " + nomes.get(1));
		
		nomes.remove(4);
		
		nomes.remove("João");
		
		System.out.println(nomes.size());
		
		System.out.println("Contém Juliano: " + nomes.contains("Juliano"));
		
		List<String> listaNova = new ArrayList<String>();
		
		listaNova.add("Ismael");
		listaNova.add("Rodrigo");
		
		listaNova.addAll(nomes);
		
		//System.out.println(listaNova);

		Collections.sort(listaNova);
		
		System.out.println("A lista nova está vazia? " + listaNova.isEmpty());
		
		
	}

}
