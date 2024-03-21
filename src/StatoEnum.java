public enum StatoEnum {
    COMPLETATO("Completato"),
    NONCOMPLETATO ("Non completato");
    private String descrizione;

    StatoEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
