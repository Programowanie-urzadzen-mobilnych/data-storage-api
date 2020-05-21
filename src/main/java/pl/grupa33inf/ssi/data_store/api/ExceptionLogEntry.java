package pl.grupa33inf.ssi.data_store.api;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class ExceptionLogEntry extends LogEntry {
    /**
     * Wiadomośc wyjątku
     */
    private String message;
    /**
     * Ślad stosu wyjątku
     */
    private String stackTrace;
    /**
     * Dodatkowe informacje o zdażeniu (np. podłączony węzeł)
     */
    private String additionalData;
}
