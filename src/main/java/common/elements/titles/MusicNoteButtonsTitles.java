package common.elements.titles;

import lombok.Getter;

@Getter
public enum MusicNoteButtonsTitles {

    ADD("add music item into list"),
    SHOW_ALL("show all music items"),
    CLEAR("clear all music items"),
    // TODO[ADD BUTTON] add button 'save on disk'
    SAVE("save on disk");

    private String buttonTitleText;

    MusicNoteButtonsTitles(final String buttonName) {
        this.buttonTitleText = buttonName;
    }

}
