package pl.grupa33inf.ssi.data_store.api;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NodeValue {
    private String value;
    private Date timestamp;
}