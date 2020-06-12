package pl.grupa33inf.ssi.data_store.api;

import java.util.Date;

import lombok.Builder;
import lombok.Value;

/**
 * Pojedyncza wartość zmiennej na węźle
 */
@Value
@Builder
public class NodeValue {
    /**
     * Wartość zmiennej
     */
    String value;
    /**
     * Znacznik czasowy mówiący kiedy zmienna została odczytana/zapisana
     */
    Date timestamp;
}