package implementandoCollectionsStreamsJava.comparator;

import java.util.Comparator;

public class EstudanteOrdemInversaComparator implements Comparator<Estudante> {

	@Override
	public int compare(Estudante o1, Estudante o2) {
		return o2.getIdade() - o1.getIdade();
	}

}
