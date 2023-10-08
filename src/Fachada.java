import classes.Administrativas;
import classes.Almoxarifado;
import classes.Alunos;

public class Fachada {
    Administrativas administracao = new Administrativas();

    Almoxarifado almoxarifado = new Almoxarifado();

    Alunos alunos = new Alunos();

    public Alunos getAlunos() {
        return alunos;
    }
    public void setAlunos(Alunos alunos) {
        this.alunos = alunos;
    }
    public Almoxarifado getAlmoxarifado() {
        return almoxarifado;
    }
    public void setAlmoxarifado(Almoxarifado almoxarifado) {
        this.almoxarifado = almoxarifado;
    }
    public Administrativas getAdministracao() {
        return administracao;
    }
    public void setAdministracao(Administrativas administracao) {
        this.administracao = administracao;
    }
}
