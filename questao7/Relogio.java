import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Relogio {
    private LocalTime hora;
    private String horaString;

    public Relogio(){
        atualizaHora();
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getHoraString() {
        return horaString;
    }

    public void setHoraString(String horaString) {
        this.horaString = horaString;
    }

    public void atualizaHora(){
        this.hora = LocalTime.now();
        this.horaString = hora.toString();
    }

}
