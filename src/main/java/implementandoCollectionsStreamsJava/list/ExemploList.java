package implementandoCollectionsStreamsJava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Anderson");
		nomes.add("Maria");
		nomes.add("João");

		System.out.println(nomes);

		nomes.set(2, "Larissa");

		System.out.println(nomes);

		Collections.sort(nomes);

		nomes.set(2, "Wesley");

		System.out.println(nomes);

		nomes.remove(4);

		System.out.println(nomes);

		nomes.remove("Wesley");

		System.out.println(nomes);

		String nome = nomes.get(3);

		System.out.println(nome);

		int pos = nomes.indexOf("Wesley");
		
		System.out.println(pos);

		int tamanho = nomes.size();
		
		System.out.println(tamanho);

		nomes.remove("Larissa");

		tamanho = nomes.size();

		boolean containsAnderson = nomes.contains("Anderson");

		System.out.println(containsAnderson);

		boolean containsFernando = nomes.contains("Fernando");

		System.out.println(containsFernando);

		boolean listaEstaVazia = nomes.isEmpty();

		System.out.println(listaEstaVazia);

		for (String nomeDoItem : nomes) {
			System.out.println("-->" + nomeDoItem);
		}
		
		Iterator<String> iterator = nomes.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("---->" + iterator.next());
		}
		
		nomes.clear();

		listaEstaVazia = nomes.isEmpty();

		System.out.println(listaEstaVazia);
		

	}

}
