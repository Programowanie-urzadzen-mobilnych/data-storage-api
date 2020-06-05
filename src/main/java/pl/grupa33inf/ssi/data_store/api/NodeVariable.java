package pl.grupa33inf.ssi.data_store.api;

import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class NodeVariable {
    private NodeValue currentValue;
    /**
     * Historia wartości
     */
    private List<NodeValue> history;
    /**
     * Zmienna readonly = true to zmienna która została odczytana z sensorów.
     * Zmienna readonly = false to zmienna konfiguracyjna
     */
    private boolean readonly;
}
