package eleicao;

public class Presidente extends Candidato{
    public Presidente(String nome, String partido, int numero) {
        super(nome, partido);
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero>11 && numero<100) {
            this.numero = numero;
        }
        else{
            this.numero = 11;
        }
    }

    private int numero = -1;
}
