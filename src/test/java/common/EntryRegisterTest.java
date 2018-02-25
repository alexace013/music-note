package common;


import org.apache.log4j.Logger;
import org.junit.Test;


public class EntryRegisterTest {

    private static final Logger LOG = Logger.getLogger(EntryRegisterTest.class);

    private static final String TEST_TEXT = "test_";
    private static final String ERT_AUTHOR = TEST_TEXT.concat("author");
    private static final String ERT_TRACK = TEST_TEXT.concat("track");
    private static final String ERT_GENRE = TEST_TEXT.concat("genre");

    @Test
    public void testEntryRegister() {
        final EntryRegister entryRegister = new EntryRegister();
        entryRegister.setAuthor(ERT_AUTHOR);
        entryRegister.setTrack(ERT_TRACK);
        entryRegister.setGenre(ERT_GENRE);
        LOG.debug(entryRegister.toString());
    }

}
