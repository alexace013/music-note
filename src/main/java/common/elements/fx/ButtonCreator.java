package common.elements.fx;

import common.elements.attributes.FxButtonElementAttributes;
import javafx.scene.control.Button;

import static javafx.scene.text.Font.font;
import static logger.Log4JWrapper.debug;
import static common.elements.titles.MusicNoteButtonsTitles.CLEAR;
import static common.elements.titles.MusicNoteButtonsTitles.SHOW_ALL;
import static common.elements.titles.MusicNoteButtonsTitles.ADD;

public class ButtonCreator extends FxButtonElementAttributes {

    public static Button getAddButton() {
        final Button addButton = new Button(ADD.getButtonTitleText());
        addButton.setFont(font(DEFAULT_FONT_STYLE, DEFAULT_FONT_SIZE));
        addButton.setPrefSize(PREF_SIZE_WIDTH, PREF_SIZE_HEIGHT);
        debug(addButton.toString());
        return addButton;
    }

    public static Button getShowButton() {
        final Button showButton = new Button(SHOW_ALL.getButtonTitleText());
        showButton.setFont(font(DEFAULT_FONT_STYLE, DEFAULT_FONT_SIZE));
        showButton.setPrefSize(PREF_SIZE_WIDTH, PREF_SIZE_HEIGHT);
        debug(showButton.toString());
        return showButton;
    }

    public static Button getClearButton() {
        final Button clearButton = new Button(CLEAR.getButtonTitleText());
        clearButton.setFont(font(DEFAULT_FONT_STYLE, DEFAULT_FONT_SIZE));
        clearButton.setPrefSize(PREF_SIZE_WIDTH, PREF_SIZE_HEIGHT);
        debug(clearButton.toString());
        return clearButton;
    }

}
