package common.elements.fx;

import javafx.scene.control.Button;

import static common.elements.MusicNoteButtons.ADD;

public class ButtonCreator {

    public static Button getAddButton() {
        final Button addButton = new Button(ADD.getButtonName());

        return addButton;
    }

}
