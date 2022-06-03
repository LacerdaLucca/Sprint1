public class Usuario {
    private String nome;
    private int acertos;
    private int erros;

    public Usuario(){
        this.acertos = 0;
        this.erros = 0;
    }
    public Usuario(String nome){
        this.nome = "XPTO";
        this.acertos = 0;
        this.erros = 0;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public String getNome() {
        return nome;
    }

    public int getAcertos() {
        return acertos;
    }

    public int getErros() {
        return erros;
    }
}
