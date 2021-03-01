import enumerador.Aluno;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Esse são os alunos do Catalisa");
        for(Aluno aluno : Aluno.values()){
            System.out.println("-> Alunos são:"+aluno);
        }

    }
}
