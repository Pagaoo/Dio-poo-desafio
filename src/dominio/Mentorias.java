package dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO * 20d;
    }

    public Mentorias() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                '}';
    }
}
