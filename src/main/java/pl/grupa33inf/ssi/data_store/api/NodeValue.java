package pl.grupa33inf.ssi.data_store.api;

import java.util.Date;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class NodeValue {
    String value;
    Date timestamp;
}