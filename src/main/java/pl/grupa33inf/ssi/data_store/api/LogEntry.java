package pl.grupa33inf.ssi.data_store.api;

import java.util.Date;

import lombok.Data;

@Data
public class LogEntry {
    /**
     * Czas wystąpienia wydażenia
     */
    private Date timestamp;

    /*
     *
     * Jednoznaczny identyfikator telefonu
     * TODO: Nie używany - brak łatwego sposobu na znalezienie
     */
//    private String phoneIdentifier;

    /**
     * Typ wydażenia
     */
    private EntryType type;

    LogEntry(/*String phoneUUID, */EntryType type) {
        this.timestamp = new Date();
        this.type = type;
    }
}
