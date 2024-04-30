package model;

import javax.swing.JOptionPane;



public class Aluno {
    private String curso;
    private int fase;
    
    public Aluno() {
        this("",0);
    }

    public Aluno(String curso, int fase) {
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    public void leitura() {
        setCurso(JOptionPane.showInputDialog("Digite seu curso: "));
        setFase(Integer.parseInt(JOptionPane.showInputDialog("Em qual fase você está: ")));
    }
    public void imprimir() {
        JOptionPane.showMessageDialog(null,"Curso: " + getCurso() + "\nFase: " + getFase());
    }
}
