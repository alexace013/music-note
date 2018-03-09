package common.elements.fx;

import javafx.scene.text.Text;
import common.elements.attributes.FxTextElementAttributes;

import static javafx.scene.text.Font.font;
import static common.elements.titles.MusicNoteFieldsTitles.AUTHOR;
import static common.elements.titles.MusicNoteFieldsTitles.TRACK;
import static common.elements.titles.MusicNoteFieldsTitles.GENRE;
import static logger.Log4JWrapper.debug;

public final class TextCreator extends FxTextElementAttributes {

    public static Text getAuthorText() {
        final Text author = new Text(AUTHOR.getFieldName() + TEXT_CHAR);
        author.setFont(font(DEFAULT_FONT_STYLE, FONT_WEIGHT, DEFAULT_FONT_SIZE));
        debug(author.toString());
        return author;
    }

    public static Text getTrackText() {
        final Text track = new Text(TRACK.getFieldName() + TEXT_CHAR);
        track.setFont(font(DEFAULT_FONT_STYLE, FONT_WEIGHT, DEFAULT_FONT_SIZE));
        debug(track.toString());
        return track;
    }

    public static Text getGenreText() {
        final Text genre = new Text(GENRE.getFieldName() + TEXT_CHAR);
        genre.setFont(font(DEFAULT_FONT_STYLE, FONT_WEIGHT, DEFAULT_FONT_SIZE));
        debug(genre.toString());
        return genre;
    }

}
