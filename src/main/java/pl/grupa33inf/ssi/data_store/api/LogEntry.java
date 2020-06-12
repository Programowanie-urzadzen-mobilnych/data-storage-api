package pl.grupa33inf.ssi.data_store.api;

import java.util.Date;

import lombok.Data;


/**
 * Podstawowe wydarzenie. Używaj ExceptionLogEntry lub InforLogEntry
 */
@Data
public class LogEntry {
    /**
     * Czas wystąpienia wydarzenia
     */
    private Date timestamp;

    /*
     *
     * Jednoznaczny identyfikator telefonu
     * TODO: Nie używany - brak łatwego sposobu na znalezienie
     */
//    private String phoneIdentifier;

    /**
     * Typ wydarzenia
     */
    private EntryType type;

    LogEntry(/*String phoneUUID, */EntryType type) {
        this.timestamp = new Date();
        this.type = type;
    }
}
