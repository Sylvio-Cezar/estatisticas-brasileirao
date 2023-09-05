package br.poo.geradorestatisticasbr.models;

import br.poo.geradorestatisticasbr.estatisticas.EstatisticaFaltasCartoes;
import br.poo.geradorestatisticasbr.estatisticas.EstatisticaGolsChutes;
import br.poo.geradorestatisticasbr.estatisticas.EstatisticaTempoJogo;
import br.poo.geradorestatisticasbr.interfaces.ImprimirEstatistica;

public enum TipoEstatistica {
    GOLS_CHUTES(new EstatisticaGolsChutes()),
    FALTAS_CARTOES(new EstatisticaFaltasCartoes()),
    TEMPO_JOGO(new EstatisticaTempoJogo());

    private ImprimirEstatistica estatistica;

    private
    TipoEstatistica(ImprimirEstatistica estatistica) {
        this.estatistica = estatistica;
    }

    public ImprimirEstatistica getEstatistica() {
        return estatistica;
    }
}
