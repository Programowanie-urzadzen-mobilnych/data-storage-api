package pl.grupa33inf.ssi.data_store.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Wydażenie informujące o czymś, niekoniecznie o problemie
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class InfoLogEntry extends LogEntry {
    /**
     * Główna wiadomość wydażenia
     */
    private String message;
    /**
     * Dodatkowe informacje o zdażeniu
     */
    private String additionalData;
}
