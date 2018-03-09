package common.elements.fx;

import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import common.elements.attributes.FxTextElementAttributes;

import static javafx.scene.text.FontWeight.NORMAL;
import static logger.Log4JWrapper.debug;

public final class TextAreaCreator extends FxTextElementAttributes {

    public static TextArea getTextArea() {
        final TextArea textArea = new TextArea();
        textArea.setFont(Font.font(DEFAULT_FONT_STYLE, NORMAL, DEFAULT_FONT_SIZE));
        textArea.setEditable(IS_EDITABLE);
        debug(textArea.toString());
        return textArea;
    }

}
