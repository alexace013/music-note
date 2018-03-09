package common;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import common.elements.titles.MusicNoteFieldsTitles;
import common.elements.titles.MusicNoteButtonsTitles;
import logger.Log4JWrapper;

import static java.lang.String.format;
import static common.elements.fx.TextCreator.getAuthorText;
import static common.elements.fx.TextCreator.getTrackText;
import static common.elements.fx.TextCreator.getGenreText;
import static common.elements.fx.TextFieldCreator.getAuthorTextField;
import static common.elements.fx.TextFieldCreator.getTrackTextField;
import static common.elements.fx.TextFieldCreator.getGenreTextField;
import static common.elements.fx.ButtonCreator.getAddButton;
import static common.elements.fx.ButtonCreator.getClearButton;
import static common.elements.fx.ButtonCreator.getShowButton;
import static common.elements.fx.TextAreaCreator.getTextArea;
import static logger.Log4JWrapper.debug;

public class MusicNoteAppFx extends Application {

    private GridPane gridPane;
    private static final String DEBUG_FOR_ADD_TEXT_ELEMENT = "created %s text element";
    private static final String DEBUG_FOR_ADD_BUTTON_ELEMENT = "created %s button element";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Music Note v.1.02");
        Log4JWrapper.info(stage.getTitle());
        setGridPane();
        gridPane.add(getAuthorText(), 0, 0);
        debug(format(DEBUG_FOR_ADD_TEXT_ELEMENT, MusicNoteFieldsTitles.AUTHOR.getFieldName()));
        gridPane.add(getTrackText(), 0, 1);
        debug(format(DEBUG_FOR_ADD_TEXT_ELEMENT, MusicNoteFieldsTitles.TRACK.getFieldName()));
        gridPane.add(getGenreText(), 0, 2);
        debug(format(DEBUG_FOR_ADD_TEXT_ELEMENT, MusicNoteFieldsTitles.GENRE.getFieldName()));
        gridPane.add(getAuthorTextField(), 1, 0);
        debug(format(DEBUG_FOR_ADD_TEXT_ELEMENT, MusicNoteFieldsTitles.AUTHOR.getFieldName()));
        gridPane.add(getTrackTextField(), 1, 1);
        gridPane.add(getGenreTextField(), 1, 2);
        gridPane.add(getAddButton(), 1, 4);
        debug(format(DEBUG_FOR_ADD_BUTTON_ELEMENT, MusicNoteButtonsTitles.ADD.toString()));
        gridPane.add(getShowButton(), 1, 5);
        debug(format(DEBUG_FOR_ADD_BUTTON_ELEMENT, MusicNoteButtonsTitles.SHOW_ALL.toString()));
        gridPane.add(getClearButton(), 1, 6);
        debug(format(DEBUG_FOR_ADD_BUTTON_ELEMENT, MusicNoteButtonsTitles.CLEAR.toString()));
        gridPane.add(getTextArea(), 2, 0, 1, 10);
        stage.setScene(createScene(gridPane));
        stage.show();
    }

    private void setGridPane() {
        gridPane = new GridPane();
        debug("==========\ncreated new GridPane and start configure...");
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
                        "new insets(%d) GridPane configure was end.\n==========",
                (long) insetsValue));
    }

    private Scene createScene(final GridPane gridPane) {
        debug("==========\npre configure Scene is started...");
        final double sceneWidth = 750.0d;
        debug(format("scene width: %d", (long) sceneWidth));
        final double sceneHeight = 280.0d;
        debug(format("scene height: %d", (long) sceneWidth));
        debug("new Scene start created\n==========");
        return new Scene(gridPane, sceneWidth, sceneHeight);
    }

}
