package common;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static common.elements.fx.TextCreator.getAuthorText;
import static common.elements.fx.TextCreator.getTrackText;
import static common.elements.fx.TextCreator.getGenreText;

public class MusicNoteAppFx extends Application {

    private GridPane gridPane;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Music Note v.1.02");
        setGridPane();
        gridPane.add(getAuthorText(), 0, 0);
        gridPane.add(getTrackText(), 0, 1);
        gridPane.add(getGenreText(), 0, 2);

        stage.setScene(createScene(gridPane));
        stage.show();
    }

    private void setGridPane() {
        final double gapValue = 10.0d;
        final double insetsValue = 25.0d;
        gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setHgap(gapValue);
        gridPane.setVgap(gapValue);
        gridPane.setPadding(new Insets(insetsValue, insetsValue, insetsValue, insetsValue));
    }

    private Scene createScene(final GridPane gridPane) {
        final double sceneWidth = 350.0d;
        final double sceneHeight = 360.0d;
        return new Scene(gridPane, sceneWidth, sceneHeight);
    }

}
