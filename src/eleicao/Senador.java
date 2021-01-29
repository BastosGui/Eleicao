package eleicao;

public class Senador extends Candidato{
    public Senador(String nome, String partido, int numero) {
        super(nome, partido);
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero>99 && numero<500) {
            this.numero = numero;
        }
        else{
            this.numero = 500;
        }
    }

    private int numero = -1;
}
