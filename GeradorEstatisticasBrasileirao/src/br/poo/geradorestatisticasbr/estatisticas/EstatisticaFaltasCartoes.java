package br.poo.geradorestatisticasbr.estatisticas;

import br.poo.geradorestatisticasbr.interfaces.ImprimirEstatistica;
import br.poo.geradorestatisticasbr.models.Jogo;

public class EstatisticaFaltasCartoes implements ImprimirEstatistica {

	@Override
	public String imprimir(Jogo jogo) {
		double totalFaltas = jogo.getFaltasTimeMandante() + jogo.getFaltasTimeVisitante();
		return "Total de Faltas: " + totalFaltas + System.lineSeparator() +
			"O time mandante teve " + (jogo.getFaltasTimeMandante() / totalFaltas * 100) + "% das faltas do jogo" + System.lineSeparator() +
			"O time visitante teve " + (jogo.getFaltasTimeVisitante() / totalFaltas * 100) + "% das faltas do jogo" + System.lineSeparator() +
			"Total de cartões amarelos do time visitante: " + jogo.getCartoesAmarelosVisitante() + System.lineSeparator() +
			"Total de cartões vermelhos do time visitante: " + jogo.getCartoesVermelhosVisitante() + System.lineSeparator() +
			"Total de cartões amarelos do time mandante: " + jogo.getCartoesAmarelosMandante() + System.lineSeparator() +
			"Total de cartões vermelhos do time mandante: " + jogo.getCartoesVermelhosMandante() + System.lineSeparator();
	}
}
