package entidades.acao;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Locacao {
    private String codProduto;
    private int matCliente;
    private Date dataSaida;
    private Date dataEntrega;

    public Locacao(String cp, int mc) {
        codProduto = cp;
        matCliente = mc;
        dataSaida = Calendar.getInstance().getTime();
        // data entrega
    }

    /**
     * Calcula multa
     * @return valor da multa
     */
    public double calculaMulta() {
        return 0.0;
    }

    
}
