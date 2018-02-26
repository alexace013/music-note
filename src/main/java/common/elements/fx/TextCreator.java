package common.elements.fx;

import javafx.scene.text.Text;
import org.apache.log4j.Logger;

import static javafx.scene.text.Font.font;
import static javafx.scene.text.FontWeight.NORMAL;
import static common.elements.MusicNoteFields.AUTHOR;
import static common.elements.MusicNoteFields.TRACK;
import static common.elements.MusicNoteFields.GENRE;

public class TextCreator {

    private static final Logger LOG = Logger.getLogger(TextCreator.class);

    private static final String DEFAULT_FONT_STYLE = "Arial";
    private static final byte FONT_SIZE = 12;
    public static final String TEXT_CHAR = ":";

    public static Text getAuthorText() {
        final Text author = new Text(AUTHOR.getParam() + TEXT_CHAR);
        author.setFont(font(DEFAULT_FONT_STYLE, NORMAL, FONT_SIZE));
        LOG.debug(author);
        return author;
    }

    public static Text getTrackText() {
        final Text track = new Text(TRACK.getParam() + TEXT_CHAR);
        track.setFont(font(DEFAULT_FONT_STYLE, NORMAL, FONT_SIZE));
        LOG.debug(track);
        return track;
    }

    public static Text getGenreText() {
        final Text genre = new Text(GENRE.getParam() + TEXT_CHAR);
        genre.setFont(font(DEFAULT_FONT_STYLE, NORMAL, FONT_SIZE));
        LOG.debug(genre);
        return genre;
    }

}
