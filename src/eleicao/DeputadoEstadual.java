package eleicao;

public class DeputadoEstadual extends Candidato{
    public DeputadoEstadual(String nome, String partido, int numero) {
        super(nome, partido);
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero>9999 && numero<45002) {
            this.numero = numero;
        }
        else{
            this.numero = 45002;
        }
    }

    private int numero;
}
