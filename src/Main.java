import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();

        //administração
        fachada.administracao.agendarEntrevista("12", "Henrique", "Padeiro");
        fachada.administracao.agendarReuniaoDiretoria("12", "Pão");
        fachada.administracao.mostrarEntrevistas();
        fachada.administracao.mostrarReunioesDiretoria();

        //Almoxarifado
        fachada.almoxarifado.adicionarProduto("chocolate", 12);
        fachada.almoxarifado.adicionarProduto("dual sense", 2);
        fachada.almoxarifado.verificarEstoque();
        fachada.almoxarifado.fazerPedidoCompra("chocolate", 2);

        //Alunos
        fachada.alunos.cadastrarAluno("Gabriel", new String[]{"EBEP", "São josé"}, 12312);
        fachada.alunos.obterInformacoesCompletasPorRDM(12312);

        //Financias

        //Infra

        //Professores
    }
}
