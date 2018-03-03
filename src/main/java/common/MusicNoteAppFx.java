package common;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import common.elements.MusicNoteFields;
import logger.Log4JWrapper;

import static java.lang.String.format;
import static common.elements.fx.TextCreator.getAuthorText;
import static common.elements.fx.TextCreator.getTrackText;
import static common.elements.fx.TextCreator.getGenreText;
import static common.elements.fx.TextFieldCreator.getAuthorTextField;
import static common.elements.fx.TextFieldCreator.getTrackTextField;
import static common.elements.fx.TextFieldCreator.getGenreTextField;
import static logger.Log4JWrapper.debug;

public class MusicNoteAppFx extends Application {

    private GridPane gridPane;
    private static final String DEBUG_FOR_ADD_TEXT_ELEMENT = "created %s text element";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Music Note v.1.02");
        Log4JWrapper.info(stage.getTitle());
        setGridPane();
        gridPane.add(getAuthorText(), 0, 0);
        debug(format(DEBUG_FOR_ADD_TEXT_ELEMENT, MusicNoteFields.AUTHOR.getParam()));
        gridPane.add(getTrackText(), 0, 1);
        debug(format(DEBUG_FOR_ADD_TEXT_ELEMENT, MusicNoteFields.TRACK.getParam()));
        gridPane.add(getGenreText(), 0, 2);
        debug(format(DEBUG_FOR_ADD_TEXT_ELEMENT, MusicNoteFields.GENRE.getParam()));
        gridPane.add(getAuthorTextField(), 1, 0);
        gridPane.add(getTrackTextField(), 1, 1);
        gridPane.add(getGenreTextField(), 1, 2);
        stage.setScene(createScene(gridPane));
        stage.show();
    }

    private void setGridPane() {
        gridPane = new GridPane();
        debug("========== created new GridPane and start configure...");
        final double gapValue = 10.0d;
        debug(format("gap value = %d", (long) gapValue));
        final double insetsValue = 25.0d;
        debug(format("insets value = %d", (long) gapValue));
        final Pos pos = Pos.TOP_LEFT;
        gridPane.setAlignment(pos);
        debug(format("set alignment : %s", pos.toString()));
        gridPane.setHgap(gapValue);
        debug(format("set h gap values as %d", (long) gapValue));
        gridPane.setVgap(gapValue);
        debug(format("set v gap values as %d", (long) gapValue));
        gridPane.setPadding(new Insets(insetsValue, insetsValue, insetsValue, insetsValue));
        debug(format("set padding with -> " +
                        "new insets(%d) GridPane configure was end. ==========",
                (long) insetsValue));
    }

    private Scene createScene(final GridPane gridPane) {
        debug("========== pre configure Scene is started...");
        final double sceneWidth = 350.0d;
        debug(format("scene width: %d", (long) sceneWidth));
        final double sceneHeight = 360.0d;
        debug(format("scene height: %d", (long) sceneWidth));
        debug("new Scene start created ==========");
        return new Scene(gridPane, sceneWidth, sceneHeight);
    }

}
