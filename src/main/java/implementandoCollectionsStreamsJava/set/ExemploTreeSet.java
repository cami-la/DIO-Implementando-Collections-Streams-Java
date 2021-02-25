package implementandoCollectionsStreamsJava.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeCapitais = new TreeSet<String>();

		// Monta a árvore com as capitais
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianópolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");

		System.out.println(treeCapitais);

		// retorna a primeira capital do topo da árvore
		System.out.println(treeCapitais.first());

		// retorna a última capital do topo da árvore
		System.out.println(treeCapitais.last());

		// retorna a primeira capital abaixo na árvore de capital parametrizada
		System.out.println(treeCapitais.lower("Florianópolis"));

		// retorna a primeira capital a cima na árvore da capital parametrizada
		System.out.println(treeCapitais.higher("Florianópolis"));

		// exibe todas as capitais no console
		System.out.println(treeCapitais);

		// retorna a primeira capital no topo da árvore, removendo do set
		System.out.println(treeCapitais.pollFirst());

		// retorna a primeira capital no topo da árvore, removendo do set
		System.out.println(treeCapitais.pollLast());

		// exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		//navega em todos os itens do iterator
		Iterator<String> iterator = treeCapitais.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for (String capital : treeCapitais) {
			System.out.println(capital);
		}
	}

}
