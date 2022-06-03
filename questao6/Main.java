public class Main {
    public static void main(String[] args) {
        System.out.println("Qual o seu nome?");
        String nome = Entradas.readString();
        Usuario usuario = new Usuario(nome);
        Quiz quiz = new Quiz();
        quiz.jogar(usuario);

    }
}
