package padroescriacao.singleton;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String servicoAgendadoSalao;
    private String cliente;

    public String getServicoAgendadoSalao() {
        return servicoAgendadoSalao;
    }

    public void setServicoAgendadoSalao(String servicoAgendadoSalao) {
        this.servicoAgendadoSalao = servicoAgendadoSalao;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
