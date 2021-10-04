import java.util.ArrayList;

import entites2.Aluno;

public class Curso {

    private Integer codigo;
    private String nomeCurso;
    private Integer cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
    }

    public Curso(int codigo, String nomeCurso, int cargaHoraria, ArrayList<Aluno> alunos) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
        this.alunos = alunos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nomeCurso;
    }

    public void setNome(String nome) {
        this.nomeCurso = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String imprimirCurso() {
        return "Codigo do curso: " + codigo + "\n" + "Nome: " + nomeCurso + "\n" + "Carga horaria: " + cargaHoraria;
    }

    public String imprimirCursoCompleto() {
        return "Codigo do curso: " + codigo + "\n" + "Nome do curso: " + nomeCurso + "\n" + "Carga horaria: "
                + cargaHoraria + "\n" + "Alunos do curso: " + alunos;
    }

}