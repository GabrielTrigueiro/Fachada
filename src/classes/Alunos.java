package classes;

import java.util.ArrayList;

public class Alunos {
    private ArrayList<Aluno> alunos;

    public Alunos() {
        alunos = new ArrayList<>();
    }

    public void cadastrarAluno(String nome, String[] historicoEscolar, double rdm) {
        Aluno aluno = new Aluno(nome, historicoEscolar, rdm);
        alunos.add(aluno);
        System.out.println("Aluno " + nome + " cadastrado com sucesso.");
    }

    public Aluno procurarAlunoPorRDM(double rdm) {
        for (Aluno aluno : alunos) {
            if (aluno.getRDM() == rdm) {
                return aluno;
            }
        }
        return null;
    }

    public void obterInformacoesCompletasPorRDM(double rdm) {
        Aluno alunoEncontrado = procurarAlunoPorRDM(rdm);
        if (alunoEncontrado != null) {
            alunoEncontrado.obterInformacoesCompletas();
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }


    private class Aluno {
        private String nome;
        private String[] historicoEscolar;
        private double rdm;

        public Aluno(String nome, String[] historicoEscolar, double rdm) {
            this.nome = nome;
            this.historicoEscolar = historicoEscolar;
            this.rdm = rdm;
        }

        public void obterInformacoesCompletas() {
            System.out.println("Informações do aluno");
            System.out.println("Nome - " + this.nome + " RDM - " + this.rdm);
            System.out.println("Histórico:");
            for(String escola : historicoEscolar){
                System.out.println(escola);
            }
            System.out.println();
        }

        public String getNome() {
            return nome;
        }

        public String[] getHistoricoEscolar() {
            return historicoEscolar;
        }

        public double getRDM() {
            return rdm;
        }
    }
}
