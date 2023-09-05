package br.poo.geradorestatisticasbr.services;
import br.poo.geradorestatisticasbr.models.Jogo;
import br.poo.geradorestatisticasbr.models.TipoEstatistica;

public class GeradorEstatisticas {

	public String gerarEstatistica(Jogo jogo, TipoEstatistica tipoEstatistica) {
		return tipoEstatistica.getEstatistica().imprimir(jogo);
	}
	
}
