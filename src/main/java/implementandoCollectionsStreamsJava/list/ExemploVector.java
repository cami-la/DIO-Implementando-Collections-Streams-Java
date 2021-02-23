package implementandoCollectionsStreamsJava.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

	public static void main(String[] args) {
		List<String> esportes = new Vector<String>();
		
		//add 4 esportes ao vetor:
		esportes.add("Futebol");
		esportes.add("Basquetebol");
		esportes.add("Tênis de mesa");
		esportes.add("Handebol");
		
		//altera valor da posição 2 do vetor:
		esportes.set(2, "Ping Pong");
		
		//remove o esporte da posição 2
		esportes.remove(2);
		
		//Remove o esporte Handebol do vetor
		esportes.remove("Handebol");
		
		//retorna o primeiro ítem do vetor
		System.out.println(esportes.get(0));
		
		//Navegar nos esportes
		for (String esporte : esportes) {
			System.out.println(esporte);
		}
	}

}
