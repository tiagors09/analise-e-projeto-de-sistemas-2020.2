package entidades.acao;

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
        Calendar.getInstance().setTime(dataSaida);
        Calendar.getInstance().add(Calendar.DATE, 7);
    }

    /**
     * Calcula multa
     * @return valor da multa
     */
    public double calculaMulta() {
        return 0.0;
    }

    public String toString() {
        return String.format("COD. PRODUTO: %s | MAT. CLIENTE: %x | DATA SAÍDA: %t | DATA ENTREGA: %t", codProduto, matCliente, dataSaida, dataEntrega);
    }
    
}
