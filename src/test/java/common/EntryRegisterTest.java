package common;


import org.apache.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;


public class EntryRegisterTest {

    private static byte countValue = 0;

    private static final Logger LOG = Logger.getLogger(EntryRegisterTest.class);

    private static final String TEST_TEXT = "test_";
    private static final String ERT_AUTHOR = TEST_TEXT.concat("author");
    private static final String ERT_TRACK = TEST_TEXT.concat("track");
    private static final String ERT_GENRE = TEST_TEXT.concat("genre");

    @Test
    public void testEntryRegister1() {
        LOG.debug(testCounterInfo());
        final EntryRegister entryRegister = new EntryRegister();
        entryRegister.setAuthor(ERT_AUTHOR);
        entryRegister.setTrack(ERT_TRACK);
        entryRegister.setGenre(ERT_GENRE);
        LOG.debug(entryRegister.toString());
    }

    @Test
    public void testEntryRegister2() {
        LOG.debug(testCounterInfo());
        final EntryRegister entryRegister = new EntryRegister(ERT_AUTHOR, ERT_TRACK, ERT_GENRE);
        LOG.debug(entryRegister.toString());
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(entryRegister.getAuthor()
                .equals(ERT_AUTHOR)).isEqualTo(Boolean.TRUE);
        softly.assertThat(entryRegister.getTrack()
                .equals(ERT_TRACK)).isEqualTo(Boolean.TRUE);
        softly.assertThat(entryRegister.getGenre()
                .equals(ERT_GENRE)).isEqualTo(Boolean.TRUE);
        softly.assertAll();
    }

    private static String testCounterInfo() {
        return String.format("run test#%s", ++countValue);
    }


}
