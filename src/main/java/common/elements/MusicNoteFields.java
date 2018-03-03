package common.elements;

import lombok.Getter;

@Getter
public enum MusicNoteFields {

    AUTHOR("author"),
    TRACK("track"),
    GENRE("genre");

    private String fieldName;

    MusicNoteFields(final String fieldName) {
        this.fieldName = fieldName;
    }

}
