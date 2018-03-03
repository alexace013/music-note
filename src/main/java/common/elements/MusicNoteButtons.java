package common.elements;

import lombok.Getter;

@Getter
public enum MusicNoteButtons {

    ADD("ADD"),
    SHOW_ALL("SHOW ALL"),
    CLEAR("CLEAR");

    private String buttonName;

    MusicNoteButtons(final String buttonName) {
        this.buttonName = buttonName;
    }

}
