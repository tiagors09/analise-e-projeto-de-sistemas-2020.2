public class Cd extends Musica{
    // diz se esta arranhado
    private boolean arranhado;
    // diz de cd duplo
    private boolean duplo;
    
    /*
     * Verifica se está arranhado
     * @param arranhado valor que diz se esta arranhado
     */
    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }

    // Diz se CD esta arranhado
    public boolean estaArranhado() {
        return arranhado;
    }

    /*
     * Altera duplicidade do cd
     * @param duplo valor que diz se cd é duplo
     */
    public void setDuplo(boolean duplo) {
        this.duplo = duplo;
    }

    // diz se o cd é duplo  
    public boolean eDuplo() {
        return duplo;
    }

    @Override
    protected double calcularDiaria() {
        // TODO Auto-generated method stub
        return 0;
    }
}
