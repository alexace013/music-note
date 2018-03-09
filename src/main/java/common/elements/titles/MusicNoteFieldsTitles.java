package common.elements.titles;

import lombok.Getter;

@Getter
public enum MusicNoteFieldsTitles {

    AUTHOR("author"),
    TRACK("track"),
    GENRE("genre");

    private String fieldName;

    MusicNoteFieldsTitles(final String fieldName) {
        this.fieldName = fieldName;
    }

}
