package implementandoCollectionsStreamsJava.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

	public static void main(String[] args) {
		Map<String, Integer> campeoesMundialFifa = new HashMap<String, Integer>();

		// adicionar os campeões mundiais fifa no mapa
		campeoesMundialFifa.put("Brasil", 5);
		campeoesMundialFifa.put("Alemanha", 4);
		campeoesMundialFifa.put("Itália", 4);
		campeoesMundialFifa.put("Uruguai", 2);
		campeoesMundialFifa.put("Argentina", 2);
		campeoesMundialFifa.put("França", 2);
		campeoesMundialFifa.put("Ingleterra", 1);
		campeoesMundialFifa.put("Espanha", 1);

		System.out.println(campeoesMundialFifa);

		//atualiza o valor para chave Brasil
		campeoesMundialFifa.put("Brasil", 6);

		System.out.println(campeoesMundialFifa);

		//retorna a Argentina
		System.out.println(campeoesMundialFifa.get("Argentina"));

		//retorna se existe ou não um campeão França
		System.out.println(campeoesMundialFifa.containsKey("França"));

		//remove o campeão França
		campeoesMundialFifa.remove("França");

		//retorna se existe ou não um campeão França
		System.out.println(campeoesMundialFifa.containsKey("França"));
		
		//retorna se existe ou não alguma seleção exa campeã
		System.out.println(campeoesMundialFifa.containsValue(6));
		
		//retorna o tamanho do Map
		System.out.println(campeoesMundialFifa.size());
		
		System.out.println(campeoesMundialFifa);
		
		//navega nos registros 
		for(Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		System.out.println();
		//navega nos registros
		for (String key : campeoesMundialFifa.keySet()) {
			System.out.println(key + " -- " + campeoesMundialFifa.get(key));
		}
		
		//verifica se contém a chave Estados Unidos
		System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));
		
		//verifica o tamanho antes e depois de limpar o mapa
		System.out.println(campeoesMundialFifa.size());
		
		campeoesMundialFifa.clear();
		
		System.out.println(campeoesMundialFifa.size());
		
	}

}
