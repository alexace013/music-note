package common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@ToString
public class EntryRegister implements Serializable {

    private static final long SERIAL_VERSION_UID = UUID.randomUUID()
            .getMostSignificantBits() & Long.MAX_VALUE;
    private String author;
    private String track;
    private String genre;

    public EntryRegister() {
    }

    public EntryRegister(String author, String track, String genre) {
        this.author = author;
        this.track = track;
        this.genre = genre;
    }

}
