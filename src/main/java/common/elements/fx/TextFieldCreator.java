package common.elements.fx;

import javafx.scene.control.TextField;
import common.elements.attributes.FxTextElementAttributes;

import static javafx.scene.text.Font.font;
import static common.elements.titles.MusicNoteFieldsTitles.AUTHOR;
import static common.elements.titles.MusicNoteFieldsTitles.GENRE;
import static common.elements.titles.MusicNoteFieldsTitles.TRACK;
import static logger.Log4JWrapper.debug;

public final class TextFieldCreator extends FxTextElementAttributes {

    private static final String DEFAULT_TEXT = "please, enter ";

    public static TextField getAuthorTextField() {
        final TextField author = new TextField(DEFAULT_TEXT + AUTHOR.getFieldName());
        author.setFont(font(DEFAULT_FONT_STYLE, FONT_WEIGHT, DEFAULT_FONT_SIZE));
        debug(author.toString());
        return author;
    }

    public static TextField getTrackTextField() {
        final TextField track = new TextField(DEFAULT_TEXT + TRACK.getFieldName());
        track.setFont(font(DEFAULT_FONT_STYLE, FONT_WEIGHT, DEFAULT_FONT_SIZE));
        debug(track.toString());
        return track;
    }

    public static TextField getGenreTextField() {
        final TextField genre = new TextField(DEFAULT_TEXT + GENRE.getFieldName());
        genre.setFont(font(DEFAULT_FONT_STYLE, FONT_WEIGHT, DEFAULT_FONT_SIZE));
        debug(genre.toString());
        return genre;
    }

}
