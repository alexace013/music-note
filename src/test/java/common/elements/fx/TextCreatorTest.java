package common.elements.fx;

import common.elements.MusicNoteFields;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class TextCreatorTest {

    @Test
    public void textCreatorTest() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(MusicNoteFields.AUTHOR.getParam() + TextCreator.TEXT_CHAR)
                .contains(TextCreator.getAuthorText().getText());
        softly.assertThat(MusicNoteFields.TRACK.getParam() + TextCreator.TEXT_CHAR)
                .contains(TextCreator.getTrackText().getText());
        softly.assertThat(MusicNoteFields.GENRE.getParam() + TextCreator.TEXT_CHAR)
                .contains(TextCreator.getGenreText().getText());
        softly.assertAll();
    }

}
