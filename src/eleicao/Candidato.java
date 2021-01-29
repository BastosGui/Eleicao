package eleicao;

public abstract class Candidato {
    public Candidato(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;
        this.numVotos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public long getNumVotos() {
        return numVotos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }

    public void incrementaVoto(){
        this.numVotos++;
    }

    public abstract int getNumero();

    private String nome;
    private String partido;
    private long numVotos;
}
