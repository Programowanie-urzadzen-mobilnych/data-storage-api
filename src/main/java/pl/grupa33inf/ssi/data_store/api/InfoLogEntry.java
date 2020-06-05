package pl.grupa33inf.ssi.data_store.api;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

/**
 * Wydażenie informujące o czymś, niekoniecznie o problemie
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class InfoLogEntry extends LogEntry {
    /**
     * Główna wiadomość wydażenia
     */
    String message;
    /**
     * Dodatkowe informacje o zdażeniu
     */
    String additionalData;

    @Builder
    public InfoLogEntry(String message, String additionalData/*, String phoneUUID*/){
        super(/*phoneUUID, */EntryType.INFO);
        this.message = message;
        this.additionalData = additionalData;
    }
}
