package implementandoCollectionsStreamsJava.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFinal {

	public static void main(String[] args) {
		Queue<String> nomes = new LinkedList<String>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("João");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		String primeiroNome = nomes.peek();
		
		System.out.println(primeiroNome);
		
//		System.out.println(nomes);
		
		String primeiroNome1 = nomes.poll();
		
//		System.out.println(primeiroNome1);
		
		System.out.println(nomes);
		
		nomes.add("Daniel");
		
		System.out.println(nomes);
		
		System.out.println("Tamanho da Lista: " + nomes.size());
		
		System.out.println("A lista está vazia? " + nomes.isEmpty());
		
		System.out.println("Carlos está na lista? " + nomes.contains("Carlos"));
		
		
		
	}

}
