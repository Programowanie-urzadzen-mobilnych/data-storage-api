package pl.grupa33inf.ssi.data_store.api;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
public class LogEntry {
    /**
     * Czas wystąpienia wydażenia
     */
    private Date timestamp;
    /**
     * Jednoznaczny identyfikator telefonu
     */
//    private String phoneIdentifier;
    /**
     * Typ wydażenia
     */
    private EntryType type;

    LogEntry(/*String phoneUUID, */EntryType type){
        this.timestamp = new Date();
//        this.phoneIdentifier = phoneUUID;
        this.type = type;
    }
}
