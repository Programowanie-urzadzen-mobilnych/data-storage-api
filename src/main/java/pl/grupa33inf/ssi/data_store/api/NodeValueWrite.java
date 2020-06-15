package pl.grupa33inf.ssi.data_store.api;

import java.util.Date;

import lombok.Value;

@Value
public class NodeValueWrite {
    String value;
    long timestamp;

    public NodeValue toProperValue() {
        return new NodeValue(value, new Date(timestamp));
    }
}
