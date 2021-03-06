package pl.grupa33inf.ssi.data_store.api;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * Wydarzenie informujące o czymś, niekoniecznie o problemie
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class InfoLogEntry extends LogEntry {
    /**
     * Główna wiadomość wydarzenia
     */
    String message;
    /**
     * Dodatkowe informacje o zdarzeniu
     */
    String additionalData;

    @Builder
    public InfoLogEntry(String message, String additionalData/*, String phoneUUID*/) {
        super(/*phoneUUID, */EntryType.INFO);
        this.message = message;
        this.additionalData = additionalData;
    }
}
