public class Ser {
    String nome;

    String sobrenome;
    int idade;

    public Ser(String nome, String sobrenome, int idade){
        this.idade = idade;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Ser(String nome, int idade) {
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    public String saudacao(){
        return null;
    }
}
