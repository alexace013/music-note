package common;


import org.apache.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;


public class EntryRegisterTest {

    private static final Logger LOG = Logger.getLogger(EntryRegisterTest.class);

    private static byte countValue = 0;

    private static final String TEST_TEXT = "test_";
    private static final String COUNTER_INFO_TEXT = "run test#%s";
    private static final String ERT_AUTHOR_TEXT = TEST_TEXT.concat("author");
    private static final String ERT_TRACK_TEXT = TEST_TEXT.concat("track");
    private static final String ERT_GENRE_TEXT = TEST_TEXT.concat("genre");

    @Test
    public void testEntryRegister1() {
        LOG.debug(testCounterInfo());
        final EntryRegister entryRegister = new EntryRegister();
        entryRegister.setAuthor(ERT_AUTHOR_TEXT);
        entryRegister.setTrack(ERT_TRACK_TEXT);
        entryRegister.setGenre(ERT_GENRE_TEXT);
        LOG.debug(entryRegister.toString());
    }

    @Test
    public void testEntryRegister2() {
        LOG.debug(testCounterInfo());
        final EntryRegister entryRegister = new EntryRegister(ERT_AUTHOR_TEXT, ERT_TRACK_TEXT, ERT_GENRE_TEXT);
        LOG.debug(entryRegister.toString());
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(entryRegister.getAuthor()
                .equals(ERT_AUTHOR_TEXT)).isEqualTo(Boolean.TRUE);
        softly.assertThat(entryRegister.getTrack()
                .equals(ERT_TRACK_TEXT)).isEqualTo(Boolean.TRUE);
        softly.assertThat(entryRegister.getGenre()
                .equals(ERT_GENRE_TEXT)).isEqualTo(Boolean.TRUE);
        softly.assertAll();
    }

    private static String testCounterInfo() {
        return String.format(COUNTER_INFO_TEXT, ++countValue);
    }


}
