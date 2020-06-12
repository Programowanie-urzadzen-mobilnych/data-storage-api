package pl.grupa33inf.ssi.data_store.api;

import lombok.EqualsAndHashCode;
import lombok.Value;


@EqualsAndHashCode(callSuper = true)
@Value
public class ExceptionLogEntry extends LogEntry {
    /**
     * Wiadomośc wyjątku
     */
    String message;
    /**
     * Dodatkowe dane do zapisu
     */
    String additionalData;

    public ExceptionLogEntry(String message, String additionalData/*, String phoneUUID*/) {
        super(/*phoneUUID, */EntryType.EXCEPTION);

        this.message = message;
        this.additionalData = additionalData;
    }

}
