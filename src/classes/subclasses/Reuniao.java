package classes.subclasses;

public class Reuniao {
    private String data;
    private String assunto;

    public Reuniao(String data, String assunto) {
        this.data = data;
        this.assunto = assunto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}