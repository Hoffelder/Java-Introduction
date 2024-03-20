import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String name;

    static String nomeProjeto = "Primeiros estudos em Java";

    protected int salary;

    public static void main(String[] args) {
        Ser meuSerAnimal = new Cachorro("Otto", 5, "Vinicius");
        Ser meuSerHumano = new Pessoa("Vinicius",  34,"Hoffelder");
        meuSerAnimal.setNome("Otto");
        System.out.println(meuSerAnimal.saudacao());
        System.out.println(meuSerHumano.saudacao());
        System.out.println(nomeProjeto);
    }

   private void atualizaSalario(){
        this.salary = 4000;
    }

   public int getSalary(){
        this.atualizaSalario();
        return this.salary;
   }

}


