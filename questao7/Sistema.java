import java.time.LocalTime;

public class Sistema {

    private static int numUsuarios;
    private static Relogio relogio;

    private static Usuario[] listaUsuarios;

    public Sistema(){
        relogio = new Relogio();
        numUsuarios = 10;
        //TODO: Lista de Usuario
        listaUsuarios = new Usuario[numUsuarios];
        for(int i = 0; i< numUsuarios;i++){
            listaUsuarios[i] = new Usuario();
        }
        listaUsuarios[0].setNome("XPTO");
        listaUsuarios[0].setSenha("AAAAA");

    }
    public static void login(Usuario usuario){
        if(valido(usuario)){
            if (!LocalTime.of(6, 0).isAfter(relogio.getHora()) && relogio.getHora().isBefore(LocalTime.of(12, 0))){
                System.out.print("Bom dia");
            }
            else if (!LocalTime.of(12, 0).isAfter(relogio.getHora()) && relogio.getHora().isBefore(LocalTime.of(18, 0))){
                System.out.print("Boa tarde");
            }else if (!LocalTime.of(18, 0).isAfter(relogio.getHora()) && relogio.getHora().isBefore(LocalTime.of(23,59,59))){
                System.out.print("Boa noite");
            }else if (!LocalTime.of(0, 0).isAfter(relogio.getHora()) && relogio.getHora().isBefore(LocalTime.of(6, 0))){
                System.out.print("Boa madrugada");
            }
            System.out.println(", você se logou ao nosso sistema.");
        }else{
            System.out.println("Usuário e/ou senha incorretos");
        }
    }
    public static boolean valido(Usuario usuario){
        boolean ehValido = false;
        int i = 0;
        while(!ehValido && i < numUsuarios) {
            if(usuario.getNome().equals(listaUsuarios[i].getNome())){
                if(usuario.getSenha().equals(listaUsuarios[i].getSenha())){
                    ehValido = true;
                }
            }
            i++;
        }
        return ehValido;
    }
}
