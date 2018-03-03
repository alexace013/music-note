package common.elements.fx;

import javafx.scene.text.Text;
import logger.Log4JWrapper;

import static javafx.scene.text.Font.font;
import static javafx.scene.text.FontWeight.NORMAL;
import static common.elements.MusicNoteFields.AUTHOR;
import static common.elements.MusicNoteFields.TRACK;
import static common.elements.MusicNoteFields.GENRE;

public class TextCreator extends FxTextElementAttributes {

    public static Text getAuthorText() {
        final Text author = new Text(AUTHOR.getFieldName() + TEXT_CHAR);
        author.setFont(font(DEFAULT_FONT_STYLE, NORMAL, FONT_SIZE));
        Log4JWrapper.debug(author.toString());
        return author;
    }

    public static Text getTrackText() {
        final Text track = new Text(TRACK.getFieldName() + TEXT_CHAR);
        track.setFont(font(DEFAULT_FONT_STYLE, NORMAL, FONT_SIZE));
        Log4JWrapper.debug(track.toString());
        return track;
    }

    public static Text getGenreText() {
        final Text genre = new Text(GENRE.getFieldName() + TEXT_CHAR);
        genre.setFont(font(DEFAULT_FONT_STYLE, NORMAL, FONT_SIZE));
        Log4JWrapper.debug(genre.toString());
        return genre;
    }

}
