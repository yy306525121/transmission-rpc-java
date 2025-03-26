package nl.stil4m.transmission.api.commands;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FreeSpaceResult {

    private String path;

    private Long sizeBytes;

    private Long totalSize;

    @JsonCreator
    public FreeSpaceResult(@JsonProperty("path") String path, @JsonProperty("size-bytes") Long sizeBytes, @JsonProperty("total_size") Long totalSize) {
        this.path = path;
        this.sizeBytes = sizeBytes;
        this.totalSize = totalSize;
    }

    public String getPath() {
        return path;
    }

    public Long getSizeBytes() {
        return sizeBytes;
    }

    public Long getTotalSize() {
        return totalSize;
    }
}
