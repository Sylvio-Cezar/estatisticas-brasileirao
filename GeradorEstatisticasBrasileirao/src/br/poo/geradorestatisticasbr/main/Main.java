package br.poo.geradorestatisticasbr.main;

import br.poo.geradorestatisticasbr.models.Jogo;
import br.poo.geradorestatisticasbr.models.TipoEstatistica;
import br.poo.geradorestatisticasbr.services.GeradorEstatisticas;

public class Main {

	public static void main(String[] args) {
		Jogo jogo = new Jogo(2, 4, 21, 30, 10, 22, 18, 20, 70, 96, 32, 1, 0, 24, 1, 1);
		GeradorEstatisticas gerador = new GeradorEstatisticas();
		System.out.println(gerador.gerarEstatistica(jogo, TipoEstatistica.FALTAS_CARTOES));
		System.out.println(gerador.gerarEstatistica(jogo, TipoEstatistica.GOLS_CHUTES));
		System.out.println(gerador.gerarEstatistica(jogo, TipoEstatistica.TEMPO_JOGO));
	}

}
