package br.poo.geradorestatisticasbr.estatisticas;

import br.poo.geradorestatisticasbr.interfaces.ImprimirEstatistica;
import br.poo.geradorestatisticasbr.models.Jogo;

public class EstatisticaGolsChutes implements ImprimirEstatistica {

	public String imprimir(Jogo jogo) {
		return "Total de gols no jogo: " + (jogo.getGolsTimeVisitante() + jogo.getGolsTimeMandante())  + System.lineSeparator() +
			"O time mandante fez " + jogo.getGolsTimeMandante() + " gols" + System.lineSeparator() +
			"O time visitante fez " + jogo.getGolsTimeVisitante() + " gols" + System.lineSeparator() +
			"O time mandante chutou " + jogo.getChutesAGolTimeMandante() + " vezes no gol" + System.lineSeparator() +
			"O time visitante chutou " + jogo.getChutesAGolTimeVisitante() + " vezes no gol" + System.lineSeparator();
	}
}
