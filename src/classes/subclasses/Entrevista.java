package classes.subclasses;

public class Entrevista {
    private String data;
    private String candidato;
    private String cargo;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Entrevista(String data, String candidato, String cargo) {
        this.data = data;
        this.candidato = candidato;
        this.cargo = cargo;
    }
}
