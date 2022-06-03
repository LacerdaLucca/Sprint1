public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o seu Usuario ");
        String nome = questao7.Entradas.readString();
        System.out.println("Digite a sua Senha ");
        String senha = questao7.Entradas.readString();
        Usuario usuario = new Usuario(nome);
        usuario.setSenha(senha);
        Sistema sistema = new Sistema();

        Sistema.login(usuario);
    }
}
