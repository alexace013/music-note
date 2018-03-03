package common.elements.fx;

import common.elements.MusicNoteFields;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class TextCreatorTest {

    @Test
    public void textCreatorTest() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(MusicNoteFields.AUTHOR.getFieldName() + TextCreator.TEXT_CHAR)
                .contains(TextCreator.getAuthorText().getText());
        softly.assertThat(MusicNoteFields.TRACK.getFieldName() + TextCreator.TEXT_CHAR)
                .contains(TextCreator.getTrackText().getText());
        softly.assertThat(MusicNoteFields.GENRE.getFieldName() + TextCreator.TEXT_CHAR)
                .contains(TextCreator.getGenreText().getText());
        softly.assertAll();
    }

}
