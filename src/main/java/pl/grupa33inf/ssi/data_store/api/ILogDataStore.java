package pl.grupa33inf.ssi.data_store.api;

public interface ILogDataStore {
    /**
     * Zapisuje dane wydażenie do bazy danych.
     *
     * @param entry Wydażenie, które należy zapisać do bazy
     */
    void save(LogEntry entry);
}
