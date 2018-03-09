package common.elements;

import common.elements.fx.TextCreator;
import common.elements.titles.MusicNoteFieldsTitles;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import utils.TestCounterUtil;

import static logger.Log4JWrapper.info;

public class MusicNoteFieldsTextTest {

    @Test
    public void musicMoteFieldsTextTest() {
        info(TestCounterUtil.getInfo());
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(MusicNoteFieldsTitles.AUTHOR.getFieldName() + TextCreator.TEXT_CHAR)
                .contains(TextCreator.getAuthorText().getText());
        softly.assertThat(MusicNoteFieldsTitles.TRACK.getFieldName() + TextCreator.TEXT_CHAR)
                .contains(TextCreator.getTrackText().getText());
        softly.assertThat(MusicNoteFieldsTitles.GENRE.getFieldName() + TextCreator.TEXT_CHAR)
                .contains(TextCreator.getGenreText().getText());
        softly.assertAll();
    }

}
