package Programa;

public class Pessoa {
    private static int counter = 1;

    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        counter++;
    }

    public String getNome() {
        return nome;
    }

    public String setNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String setCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail() {
        return email;
    }

    public String toString() {
        return "\nNome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nEmail: " + this.getEmail();
    }
}
