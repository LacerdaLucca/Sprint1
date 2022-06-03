public class Main {
    public static void main(String[] args) {
        boolean tentarNovamente = false;
        do {
            System.out.println("Digite o seu Usuario ");
            String nome = Entradas.readString();
            System.out.println("Digite a sua Senha ");
            String senha = Entradas.readString();
            Usuario usuario = new Usuario(nome, senha);
            Sistema sistema = new Sistema();
            if(!Sistema.login(usuario)){
                System.out.println("Quer tentar de novo?");
                String resp = Entradas.readString();
                if(resp.equals("S") || resp.equals("SIM"))
                    tentarNovamente = true;
            }
        }while(tentarNovamente);
    }
}
