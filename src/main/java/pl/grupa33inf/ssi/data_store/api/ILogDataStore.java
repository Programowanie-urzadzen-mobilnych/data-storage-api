package pl.grupa33inf.ssi.data_store.api;

/**
 * Interfejs służący do logowania wydarzeń do bazy
 */
public interface ILogDataStore {
    /**
     * Zapisuje dane wydarzenie do bazy danych.
     *
     * @param entry Wydarzenie, które należy zapisać do bazy
     */
    void save(LogEntry entry);
}
