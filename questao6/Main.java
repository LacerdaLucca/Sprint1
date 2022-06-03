public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("XPTO");
        Quiz quiz = new Quiz();
        quiz.jogar();
        System.out.println("Usuario " + usuario.getNome() +
                "\nAcertos " + usuario.getAcertos() +
                "\nErros " + usuario.getErros());
    }
}
