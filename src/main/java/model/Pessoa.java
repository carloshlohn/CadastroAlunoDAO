package model;

import javax.swing.JOptionPane;

public class Pessoa {
    private int id;
    private int idade;
    private String nome;

    public Pessoa() {
        this(0,0,"");
    }
    public Pessoa(int id, int idade, String nome) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void leitura() {
        setId(Integer.parseInt(JOptionPane.showInputDialog("Digite seu ID:")));
        setNome(JOptionPane.showInputDialog("Digite seu nome"));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
    }
    public void imprimir() {
        JOptionPane.showMessageDialog(null,"Nome: " + getNome() + "\nID: " + getId() + "\nIdade: " + getIdade());
    }
}
