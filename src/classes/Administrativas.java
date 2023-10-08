package classes;
import classes.subclasses.Entrevista;
import classes.subclasses.Reuniao;

import java.util.ArrayList;

public class Administrativas {
    private ArrayList<Reuniao> reunioesDiretoria;
    private ArrayList<Entrevista> entrevistas;

    public Administrativas() {
        this.reunioesDiretoria = new ArrayList<>();
        this.entrevistas = new ArrayList<>();
    }

    public void agendarReuniaoDiretoria(String data, String assunto) {
        Reuniao reuniao = new Reuniao(data, assunto);
        reunioesDiretoria.add(reuniao);
    }

    public void agendarEntrevista(String data, String candidato, String cargo) {
        Entrevista entrevista = new Entrevista(data, candidato, cargo);
        entrevistas.add(entrevista);
    }

    public void mostrarReunioesDiretoria() {
        System.out.println("Reuniões Agendadas com a Diretoria:");
        for (Reuniao reuniao : reunioesDiretoria) {
            System.out.println("Data: " + reuniao.getData() + ", Assunto: " + reuniao.getAssunto());
        }
        System.out.println();
    }

    public void mostrarEntrevistas() {
        System.out.println("Entrevistas Agendadas:");
        for (Entrevista entrevista : entrevistas) {
            System.out.println("Data: " + entrevista.getData() + ", Candidato: " + entrevista.getCandidato() + ", Cargo: " + entrevista.getCargo());
        }
        System.out.println();
    }
}
