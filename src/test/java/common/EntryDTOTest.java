package common;

import common.dto.EntryDTO;
import logger.Log4JWrapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Test;
import utils.TestCounterUtil;

import static java.lang.String.format;

public class EntryDTOTest {

    private static final String TEST_TEXT = "test_";
    private static final String AUTHOR_TEXT = TEST_TEXT.concat("author");
    private static final String TRACK_TEXT = TEST_TEXT.concat("track");
    private static final String GENRE_TEXT = TEST_TEXT.concat("genre");
    private static final String EXPECTED_ENTRY_DTO_TEXT = new StringBuilder()
            .append(format("%s(", EntryDTO.class.getSimpleName().replace("()", "")))
            .append(format("%s=%s, ", AUTHOR_TEXT.replace(TEST_TEXT, ""), AUTHOR_TEXT))
            .append(format("%s=%s, ", TRACK_TEXT.replace(TEST_TEXT, ""), TRACK_TEXT))
            .append(format("%s=%s)", GENRE_TEXT.replace(TEST_TEXT, ""), GENRE_TEXT))
            .toString();

    @Test
    public void testSetEntryDTO() {
        Log4JWrapper.info(TestCounterUtil.getInfo());
        final EntryDTO entryRegister = new EntryDTO();
        entryRegister.setAuthor(AUTHOR_TEXT);
        entryRegister.setTrack(TRACK_TEXT);
        entryRegister.setGenre(GENRE_TEXT);
        final String actualEntryDtoText = entryRegister.toString();
        Log4JWrapper.debug(actualEntryDtoText);
        Assert.assertEquals("Entry DTO has wrong text",
                EXPECTED_ENTRY_DTO_TEXT, actualEntryDtoText);
    }

    @Test
    public void testGetEntryDTO() {
        Log4JWrapper.info(TestCounterUtil.getInfo());
        final EntryDTO entryDTO = new EntryDTO(AUTHOR_TEXT, TRACK_TEXT, GENRE_TEXT);
        Log4JWrapper.debug(entryDTO.toString());
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(entryDTO.getAuthor()
                .equals(AUTHOR_TEXT)).isEqualTo(Boolean.TRUE);
        softly.assertThat(entryDTO.getTrack()
                .equals(TRACK_TEXT)).isEqualTo(Boolean.TRUE);
        softly.assertThat(entryDTO.getGenre()
                .equals(GENRE_TEXT)).isEqualTo(Boolean.TRUE);
        softly.assertAll();
    }

}
