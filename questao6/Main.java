public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("XPTO");
        Quis quis = new Quis();
        System.out.println("Usuario " + usuario.getNome());
        System.out.println("Acertos " + usuario.getAcertos());
        System.out.println("Erros " + usuario.getErros());
    }
}
