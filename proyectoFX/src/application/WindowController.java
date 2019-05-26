package application;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class WindowController {

    @FXML
    private Pane panelMusic;

    @FXML
    private Pane panelPublications;

    @FXML
    private Pane panelGames;

    @FXML
    private Pane panelSettings;

    @FXML
    private Pane panelSeries;

    @FXML
    private Pane panelMovies;
    
    @FXML
    private JFXButton bttMovies;
    
    @FXML
    private JFXButton bttSeries;
    
    @FXML
    private JFXButton bttMusic;
    
    @FXML
    private JFXButton bttPublications;
    
    @FXML
    private JFXButton bttGames;
    
    @FXML
    private JFXButton bttSettings;
    
    public void initialize() {
    	bttMovies = new JFXButton();
    	bttSeries = new JFXButton();
    	bttMusic = new JFXButton();
    	bttPublications = new JFXButton();
    	bttGames = new JFXButton();
    	bttSettings = new JFXButton();
    }

    @FXML
    void showPanelGames(ActionEvent event) {
    	panelMusic.toBack();
    	panelMusic.setVisible(false);
    	panelPublications.toBack();
    	panelPublications.setVisible(false);
    	panelSeries.toBack();
    	panelSeries.setVisible(false);
    	panelSettings.toBack();
    	panelSettings.setVisible(false);
    	panelMovies.toBack();
    	panelMovies.setVisible(false);
    	panelGames.setVisible(true);
    	panelGames.toFront();
    }

    @FXML
    void showPanelMovies(ActionEvent event) {
    	panelMusic.toBack();
    	panelMusic.setVisible(false);
    	panelPublications.toBack();
    	panelPublications.setVisible(false);
    	panelSeries.toBack();
    	panelSeries.setVisible(false);
    	panelSettings.toBack();
    	panelSettings.setVisible(false);
    	panelGames.setVisible(false);
    	panelGames.toBack();
    	panelMovies.toFront();
    	panelMovies.setVisible(true);
    }

    @FXML
    void showPanelMusic(ActionEvent event) {
    	panelPublications.toBack();
    	panelPublications.setVisible(false);
    	panelSeries.toBack();
    	panelSeries.setVisible(false);
    	panelSettings.toBack();
    	panelSettings.setVisible(false);
    	panelMovies.toBack();
    	panelMovies.setVisible(false);
    	panelGames.setVisible(false);
    	panelGames.toBack();
    	panelMusic.toFront();
    	panelMusic.setVisible(true);
    }

    @FXML
    void showPanelPublications(ActionEvent event) {
    	panelSeries.toBack();
    	panelSeries.setVisible(false);
    	panelSettings.toBack();
    	panelSettings.setVisible(false);
    	panelMovies.toBack();
    	panelMovies.setVisible(false);
    	panelGames.setVisible(false);
    	panelGames.toBack();
    	panelMusic.toBack();
    	panelMusic.setVisible(false);
    	panelPublications.toFront();
    	panelPublications.setVisible(true);
    }

    @FXML
    void showPanelSeries(ActionEvent event) {
    	panelSettings.toBack();
    	panelSettings.setVisible(false);
    	panelMovies.toBack();
    	panelMovies.setVisible(false);
    	panelGames.setVisible(false);
    	panelGames.toBack();
    	panelMusic.toBack();
    	panelMusic.setVisible(false);
    	panelPublications.toBack();
    	panelPublications.setVisible(false);
    	panelSeries.toFront();
    	panelSeries.setVisible(true);

    }

    @FXML
    void showPanelSettings(ActionEvent event) {
    	panelMovies.toBack();
    	panelMovies.setVisible(false);
    	panelGames.setVisible(false);
    	panelGames.toBack();
    	panelMusic.toBack();
    	panelMusic.setVisible(false);
    	panelPublications.toBack();
    	panelPublications.setVisible(false);
    	panelSeries.toBack();
    	panelSeries.setVisible(false);
    	panelSettings.toFront();
    	panelSettings.setVisible(true);
    }
}
    