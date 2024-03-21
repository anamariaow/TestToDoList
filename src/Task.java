import java.time.OffsetDateTime;

public class Task {
    private String descrizione;
    private OffsetDateTime scadenza;
    private StatoEnum statoEnum;

    public Task(String descrizione, OffsetDateTime scadenza, StatoEnum statoEnum) {
        this.descrizione = descrizione;
        this.scadenza = scadenza;
        this.statoEnum = statoEnum;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public OffsetDateTime getScadenza() {
        return scadenza;
    }

    public void setScadenza(OffsetDateTime scadenza) {
        this.scadenza = scadenza;
    }

    public StatoEnum getStatoEnum() {
        return statoEnum;
    }

    public void setStatoEnum(StatoEnum statoEnum) {
        this.statoEnum = statoEnum;
    }


    @Override
    public String toString() {
        return "Task: " +
                 " - " + descrizione +
                " - scadenza: " + scadenza +
                " - stato: " + statoEnum;
    }
}
