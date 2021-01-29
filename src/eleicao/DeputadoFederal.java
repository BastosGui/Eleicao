package eleicao;

public class DeputadoFederal extends Candidato {
    public DeputadoFederal(String nome, String partido, int numero) {
        super(nome, partido);
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero>999 && numero<5002) {
            this.numero = numero;
        }
        else{
            this.numero = 5002;
        }
    }

    private int numero = -1;
}
