package br.poo.geradorestatisticasbr.estatisticas;

import br.poo.geradorestatisticasbr.interfaces.ImprimirEstatistica;
import br.poo.geradorestatisticasbr.models.Jogo;

public class EstatisticaTempoJogo implements ImprimirEstatistica {

	@Override
	public String imprimir(Jogo jogo) {
		return "A bola ficou rolando por " + (jogo.getTempoTotalBolaRolandoEmMin() / jogo.getTempoTotalJogoEmMin() * 100) + "% do tempo de jogo" + System.lineSeparator() +
			"O time mandante ficou " + (jogo.getPosseBolaTimeMandanteAtaqueEmMin() / (jogo.getPosseBolaTimeMandanteDefesaEmMin() + jogo.getPosseBolaTimeMandanteAtaqueEmMin()) * 100) + "% do tempo de jogo na defesa" + System.lineSeparator() +
			"O time mandante ficou " + (jogo.getPosseBolaTimeVisitanteDefesaEmMin() / (jogo.getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getPosseBolaTimeVisitanteAtaqueEmMin()) * 100) + "% do tempo de jogo no ataque" + System.lineSeparator() +
			"O time visitante ficou " + (jogo.getPosseBolaTimeVisitanteAtaqueEmMin() / (jogo.getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getPosseBolaTimeVisitanteAtaqueEmMin()) * 100) + "% do tempo de jogo na defesa" + System.lineSeparator() +
			"O time visitante ficou " + (jogo.getPosseBolaTimeVisitanteDefesaEmMin() / (jogo.getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getPosseBolaTimeVisitanteAtaqueEmMin()) * 100) + "% do tempo de jogo no ataque" + System.lineSeparator();
	}
	
	
}
