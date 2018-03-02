package common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@ToString
public class EntryDTO implements Serializable {

    private static final long SERIAL_VERSION_UID = UUID.randomUUID()
            .getMostSignificantBits() & Long.MAX_VALUE;
    private String author;
    private String track;
    private String genre;

    public EntryDTO() {
    }

    public EntryDTO(String author, String track, String genre) {
        this.author = author;
        this.track = track;
        this.genre = genre;
    }

}
