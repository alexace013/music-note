package common.elements;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.util.Optional;

import static java.lang.String.format;
import static common.elements.MusicNoteButtonsTitles.ADD;
import static common.elements.MusicNoteButtonsTitles.CLEAR;
import static common.elements.MusicNoteButtonsTitles.SHOW_ALL;
// TODO[ADD BUTTON] import SAVE button
//import static common.elements.MusicNoteButtonsTitles.SAVE;

public class MusicNoteButtonsTitlesTest {

    private static final String ADD_BUTTON_TEXT = "add music item into list";
    private static final String SHOW_BUTTON_TEXT = "show all music items";
    private static final String CLEAR_BUTTON_TEXT = "clear all music items";
    // TODO [ADD BUTTON] uncomment + refactoring (without empty object + add into tests)
//    private static final String SAVE_BUTTON_TEXT = null;
    private static final Optional<String> SAVE_BUTTON_TEXT_EMPTY = Optional.empty();
    private static final String DESCRIPTION_TEXT = "!!! button %s has is not correctly text !!!";
    private static final String DEFAULT_TEST_TEXT = "default text";

    @Test
    public void checkButtonsTitlesTextsPositive() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(ADD.getButtonTitleText())
                .as(format(DESCRIPTION_TEXT, ADD.toString()))
                .isEqualTo(ADD_BUTTON_TEXT);
        softly.assertThat(CLEAR.getButtonTitleText())
                .as(format(DESCRIPTION_TEXT, CLEAR.toString()))
                .isEqualTo(CLEAR_BUTTON_TEXT);
        softly.assertThat(SHOW_ALL.getButtonTitleText())
                .as(format(DESCRIPTION_TEXT, SHOW_ALL.toString()))
                .isEqualTo(SHOW_BUTTON_TEXT);
        softly.assertThat(Optional.empty())
                .as("!!! Not OPTIONAL !!!")
                .isEqualTo(SAVE_BUTTON_TEXT_EMPTY);
        softly.assertAll();
    }

    @Test
    public void checkButtonsTitlesTextsNegative() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(ADD.getButtonTitleText())
                .isNotEqualTo(DEFAULT_TEST_TEXT)
                .as(format(DESCRIPTION_TEXT, ADD.toString()));
        softly.assertThat(CLEAR.getButtonTitleText())
                .isNotEqualTo(DEFAULT_TEST_TEXT)
                .as(format(DESCRIPTION_TEXT, CLEAR.toString()));
        softly.assertThat(SHOW_ALL.getButtonTitleText())
                .isNotEqualTo(DEFAULT_TEST_TEXT)
                .as(format(DESCRIPTION_TEXT, SHOW_ALL.toString()));
        softly.assertThat(Optional.empty())
                .isNotEqualTo(SAVE_BUTTON_TEXT_EMPTY.toString())
                .as("!!! Not OPTIONAL !!!");
        softly.assertAll();
    }

}
