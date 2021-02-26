package implementandoCollectionsStreamsJava.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

	public static void main(String[] args) {
		Hashtable<String, Integer> estudantes = new Hashtable<String, Integer>();
		
		estudantes.put("Carlos", 21);
		estudantes.put("Mariana", 33);
		estudantes.put("Rafaele", 18);
		estudantes.put("Pedro", 44);
		
		System.out.println(estudantes);
		
		estudantes.put("Pedro", 55);
		
		System.out.println(estudantes);
		
		//remove um estudante no índice 0
		estudantes.remove("Pedro");
		
		System.out.println(estudantes);
		
		//recupera um estudante no índice 2;
		int idadeEstudante = estudantes.get("Mariana");
		
		System.out.println(idadeEstudante);
		
		System.out.println(estudantes.size());
		
		//navega nos registros do map
		for(Map.Entry<String, Integer> entry : estudantes.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		for (String key : estudantes.keySet()) {
			System.out.println(key + " --- " + estudantes.get(key));
		}
	}

}
