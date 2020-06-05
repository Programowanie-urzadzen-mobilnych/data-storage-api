package pl.grupa33inf.ssi.data_store.api;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;


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
    private String additionalData;

    @Builder
    public ExceptionLogEntry(String message, String additionalData/*, String phoneUUID*/){
        super(/*phoneUUID, */EntryType.EXCEPTION);

        this.message = message;
        this.additionalData = additionalData;
    }
}
