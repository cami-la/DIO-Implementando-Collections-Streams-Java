package implementandoCollectionsStreamsJava.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
	public static void main(String[] args) {
		Set<Integer> sequenciaNumerica = new LinkedHashSet<Integer>();

		// adiciona os números no set
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(1);

		System.out.println(sequenciaNumerica);

		// remove a nota no set
		sequenciaNumerica.remove(4);

		System.out.println(sequenciaNumerica);

		// retorna a quantidade de itens no set
		System.out.println(sequenciaNumerica.size());

		// navega em todos os itens do iterator
		Iterator<Integer> iteratorNotasAlunos = sequenciaNumerica.iterator();

		while (iteratorNotasAlunos.hasNext()) {
			System.out.println(iteratorNotasAlunos.next());
		}

		for (Integer nota : sequenciaNumerica) {
			System.out.println(nota);
		}

		sequenciaNumerica.clear();

		// retorna se o set está vazio ou não
		System.out.println(sequenciaNumerica.isEmpty());
	}
}
