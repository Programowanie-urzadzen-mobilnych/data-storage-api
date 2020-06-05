package pl.grupa33inf.ssi.data_store.api;

public interface ILogDatastore {
    /**
     * Zapisuje dane wydażenie do bazy danych.
     * @param entry Wydażenie, które należy zapisać do bazy
     */
    public <T extends LogEntry> void save(T entry);
}
