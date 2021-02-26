package implementandoCollectionsStreamsJava.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> treeCapitais = new TreeMap<String, String>();

		// monta a árvore com as capitais
		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Florianópolis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "São Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("BH", "Belo Horizonte");

		System.out.println(treeCapitais);

		// retorna a primeira capital do topo da árvore
		System.out.println(treeCapitais.firstKey());

		// retorna a última capital do topo da árvore
		System.out.println(treeCapitais.lastKey());

		// retorna a primeira capital abaixo na árvore de capital parametrizada
		System.out.println(treeCapitais.lowerKey("SC"));

		// retorna a primeira capital a cima na árvore da capital parametrizada
		System.out.println(treeCapitais.higherKey("SC"));

		// exibe todas as capitais no console
		System.out.println(treeCapitais);

		// retorna a primeira capital no topo da árvore
		System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

		// retorna a última capital no final da árvore
		System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

		// retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue());

		// exibe todas as capitais no console
		System.out.println(treeCapitais);

		Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
		Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

		// retorna a primeira capital do topo da árvore, removendo do map
		System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());

		// retorna a última capital do final da árvore, removendo do map
		System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

		// exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		// navega em todas as chaves do iterator
		Iterator<String> iterator = treeCapitais.keySet().iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " - " + treeCapitais.get(key));
		}
		
		for (String capital : treeCapitais.keySet()) {
			System.out.println(capital + " -- " + treeCapitais.get(capital));
		}
		
		for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
			System.out.println(capital.getKey() + " --- " + capital.getValue());
		}
	}

}
