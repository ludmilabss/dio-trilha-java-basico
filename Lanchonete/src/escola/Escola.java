package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        // Atribuição
        felipe.setNome("Felipe Bezerra");
        felipe.setIdade(23);
        felipe.setSexo("Masculino");

        // Obtenção de valores
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos e é do sexo " + felipe.getSexo());

    }
}
