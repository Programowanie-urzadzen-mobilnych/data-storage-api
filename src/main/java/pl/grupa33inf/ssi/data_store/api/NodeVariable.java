package pl.grupa33inf.ssi.data_store.api;

import java.util.List;

import lombok.Value;

/**
 * Zmienna na węźle, razem z historią
 */
@Value
public class NodeVariable {
    /**
     * Obecna wartość
     */
    NodeValue currentValue;
    /**
     * Historia wartości
     */

    List<NodeValue> history;
    /**
     * Zmienna readonly = true to zmienna która została odczytana z sensorów.
     * Zmienna readonly = false to zmienna konfiguracyjna
     */
    boolean readonly;
}
