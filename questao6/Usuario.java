public class Usuario {
    private String Nome;
    private int acertos;
    private int erros;

    public Usuario(){
        this.acertos = 0;
        this.erros = 0;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public String getNome() {
        return Nome;
    }

    public int getAcertos() {
        return acertos;
    }

    public int getErros() {
        return erros;
    }
}
