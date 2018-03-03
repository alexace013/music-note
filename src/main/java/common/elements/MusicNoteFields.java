package common.elements;

import lombok.Getter;

@Getter
public enum MusicNoteFields {
    AUTHOR("author"),
    TRACK("track"),
    GENRE("genre");

    private String param;

    MusicNoteFields(final String param) {
        this.param = param;
    }

}
