package implementandoCollectionsStreamsJava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorsExampleList {
	public static void main(String[] args) {
		ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
		estudantes.add(new Estudante("Pedro", 19));
		estudantes.add(new Estudante("Carlos", 23));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("João", 18));
		estudantes.add(new Estudante("Thiago", 20));
		estudantes.add(new Estudante("George", 22));
		estudantes.add(new Estudante("Larissa", 21));
		
		System.out.println("--- Ordem de Insersão ---");
		System.out.println(estudantes);
		
		estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
		
		System.out.println("--- Ordem natural dos números: Idade ---");
		System.out.println(estudantes);
		
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
		
		System.out.println("--- Ordem Reversados números: Idade ---");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
		System.out.println("--- Ordem natural dos números: Idade (method reference) ---");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
		System.out.println("--- Ordem Reversa dos números: Idade (method reference) ---");
		System.out.println(estudantes);
		
		Collections.sort(estudantes);
		System.out.println("--- Ordem natural dos números: Idade (interface comparable) ---");
		System.out.println(estudantes);
		
		
		Collections.sort(estudantes, new EstudanteOrdemInversaComparator());
		System.out.println("--- Ordem natural dos números: Idade (interface comparator) ---");
		System.out.println(estudantes);
		
		
	}
	
}
