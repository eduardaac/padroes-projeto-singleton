package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarServicoAgendado() {
        Parametros.getInstance().setServicoAgendadoSalao("Corte de cabelo agendado para às 16 horas no dia 03/10/2025");
        assertEquals("Corte de cabelo agendado para às 16 horas no dia 03/10/2025", Parametros.getInstance().getServicoAgendadoSalao());
    }

    @Test
    public void deveRetornarNomeCliente() {
        Parametros.getInstance().setCliente("Eduarda");
        assertEquals("Eduarda", Parametros.getInstance().getCliente());
    }

}