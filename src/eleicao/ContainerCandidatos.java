package eleicao;

import java.util.ArrayList;

public class ContainerCandidatos {
    public static ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public static boolean confere(Candidato aux){
        for(Candidato candi : candidatos){
            if(aux.getNumero() == candi.getNumero() && aux.getClass() == candi.getClass()){
                return true;
            }
        }
        return false;
    }

    public static Presidente presidenteMaisVotado(){
        Presidente mais = new Presidente("nome", "partido", 0);
        mais.setNumVotos(-1);
        for(Candidato aux : candidatos){
            if(aux.getClass().equals(mais.getClass()) && mais.getNumVotos() < aux.getNumVotos()){
                mais = (Presidente) aux;
            }
        }
        return mais;
    }

    public static Governador governadorMaisVotado(){
        Governador mais = new Governador("nome", "partido", 0);
        mais.setNumVotos(-1);
        for(Candidato aux : candidatos){
            if(aux.getClass().equals(mais.getClass()) && mais.getNumVotos() < aux.getNumVotos()){
                mais = (Governador) aux;
            }
        }
        return mais;
    }

    public static Senador senadorMaisVotado(){
        Senador mais = new Senador("nome", "partido", 0);
        mais.setNumVotos(-1);
        for(Candidato aux : candidatos){
            if(aux.getClass().equals(mais.getClass()) && mais.getNumVotos() < aux.getNumVotos()){
                mais = (Senador) aux;
            }
        }
        return mais;
    }

    public static DeputadoFederal deputadoFederalMaisVotado(){
        DeputadoFederal mais = new DeputadoFederal("nome", "partido", 0);
        mais.setNumVotos(-1);
        for(Candidato aux : candidatos){
            if(aux.getClass().equals(mais.getClass()) && mais.getNumVotos() < aux.getNumVotos()){
                mais = (DeputadoFederal) aux;
            }
        }
        return mais;
    }

    public static DeputadoEstadual deputadoEstadualMaisVotado(){
        DeputadoEstadual mais = new DeputadoEstadual("nome", "partido", 0);
        mais.setNumVotos(-1);
        for(Candidato aux : candidatos){
            if(aux.getClass().equals(mais.getClass()) && mais.getNumVotos() < aux.getNumVotos()){
                mais = (DeputadoEstadual) aux;
            }
        }
        return mais;
    }

    static ArrayList<Candidato> candidatos = new ArrayList<>();
}
