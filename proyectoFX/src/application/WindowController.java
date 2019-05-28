 package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.sun.javafx.geom.Rectangle;

import exceptions.BlankException;
import exceptions.RepeatedUserException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.StageStyle;
import model.Book;
import model.DigitalPlataform;
import threads.GameOneThread;
import threads.GameThreeThread;
import threads.GameTwoThread;

public class WindowController {
	@FXML
	private Pane paneGameOne;
    @FXML
    private Circle c1;

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
    
    @FXML
    private ListView<Book> booksList;

    @FXML
    private ImageView imageBooks;
    
    @FXML
    private Button bttGame1;

    @FXML
    private Button bttGame2;

    @FXML
    private Button bttgGame3;

    @FXML
    private Button bttGame4;

    @FXML
    private Button bttGame5;
    
    @FXML
    private Button bttBeforeTwo;
    
    @FXML
    private JFXButton btSignIn;
    
    @FXML
    private JFXButton btSignUp;
    
    @FXML
    private JFXButton xd;
    
    @FXML
    private AnchorPane anchorSignIn;
    
    @FXML
    private AnchorPane anchorSignUp;
    
    @FXML
    private Button bttEnter;
    
    @FXML
    private Button bttBeforeOne;
    
    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXPasswordField txtPassword;
    @FXML
    private JFXTextField txtUsernameSignIn;

    @FXML
    private JFXPasswordField txtPasswordSignIn;
    
    @FXML
    private Arc pacman;

    @FXML
    private Ellipse elipse;

    @FXML
    private Circle c2;
    @FXML
    private Circle c3;
    @FXML
    private Circle c4;
    @FXML
    private Pane paneGameTwo;
    
    int dx;
    int dy;
    int dyCircle3;
    int dyCircle4;
    int dyCircle2;
    
    private DigitalPlataform dg;
    private GameOneThread gameOneThread;
    private GameTwoThread gameTwoThread;
    private GameThreeThread gameThreeThread;
    private Thread th1;
    private Thread th2;
    
    
    private final ObservableList<Book> books = 
    	      FXCollections.observableArrayList();
    
    public void initialize() {
    	dg = new DigitalPlataform("Spotflix");
    	bttMovies = new JFXButton();
    	bttSeries = new JFXButton();
    	bttMusic = new JFXButton();
    	bttPublications = new JFXButton();
    	bttGames = new JFXButton();
    	bttSettings = new JFXButton();
    	btSignIn = new JFXButton();
    	btSignUp = new JFXButton();
    	gameOneThread = new GameOneThread(this);
    	gameTwoThread = new GameTwoThread(this);
    	dx = 5;
    	dy = 4;
    	dyCircle4 = 7;
    	dyCircle3 = 2;
    	dyCircle2 = 15;
    	th1 = new Thread(gameOneThread);
    	th2 = new Thread(gameTwoThread);
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
    @FXML
    public void enterAction(ActionEvent event) {
    	try {
    		String nickname = txtUsernameSignIn.getText();
    		String password = txtPasswordSignIn.getText();
    		if(dg.joinUser(nickname, password)) {
        		Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));
        		bttEnter.getScene().setRoot(root);
        		txtPasswordSignIn.clear();
        		txtUsernameSignIn.clear();
    		}
    		else {
    			Alert ventanita = new Alert(AlertType.ERROR);
    			ventanita.setTitle("Unregistered user");
    			ventanita.setHeaderText("Please Register");
    			ventanita.setContentText("Go to sign up" );
    			ventanita.initStyle(StageStyle.UTILITY);
    			ventanita.showAndWait();
    		}
    	}catch(BlankException e) {
			Alert ventanita = new Alert(AlertType.ERROR);
			ventanita.setTitle("Error");
			ventanita.setHeaderText("BlankException");
			ventanita.setContentText("" + e.getMessage() );
			ventanita.initStyle(StageStyle.UTILITY);
			ventanita.showAndWait();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }

    @FXML
    public void signInAction(ActionEvent event) {
    	anchorSignUp.toBack();
    	anchorSignUp.setVisible(false);
    	anchorSignIn.setVisible(true);
    	anchorSignIn.toFront();
    	txtUserName.clear();
    	txtPassword.clear();
    	txtEmail.clear();
    }

    @FXML
    public void signUpAction(ActionEvent event) {
    	anchorSignIn.toBack();
    	anchorSignIn.setVisible(false);
    	anchorSignUp.toFront();
    	anchorSignUp.setVisible(true);
    	txtPasswordSignIn.clear();
    	txtUsernameSignIn.clear();
    }
	@FXML
	void showGameTwoAction() {
		
	}
    @FXML
    void registerUserAction(ActionEvent event) {
    	try {
    		String nickname = txtUserName.getText();
    		String email = txtEmail.getText();
    		String password = txtPassword.getText();
    		dg.addUser(nickname, password, email);
    		dg.save();
    		anchorSignUp.setVisible(false);
    		anchorSignUp.toBack();
    		anchorSignIn.toFront();
    		anchorSignIn.setVisible(true);
    		txtUserName.clear();
    		txtEmail.clear();
    		txtPassword.clear();
    	}catch(BlankException e) {
			Alert ventanita = new Alert(AlertType.ERROR);
			ventanita.setTitle("Error");
			ventanita.setHeaderText("BlankException");
			ventanita.setContentText("" + e.getMessage() );
			ventanita.initStyle(StageStyle.UTILITY);
			ventanita.showAndWait();
    	}
    	catch(RepeatedUserException e) {
			Alert ventanita = new Alert(AlertType.ERROR);
			ventanita.setTitle("Error");
			ventanita.setHeaderText("RepeatedUserException");
			ventanita.setContentText("" + e.getMessage() );
			ventanita.initStyle(StageStyle.UTILITY);
			ventanita.showAndWait();
    	}
    }

    @FXML
    void bttSearchBooks(ActionEvent event) {

    }
    @FXML
    void showGameOneAction(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("GameUno.fxml"));
    		bttGame1.getScene().setRoot(root);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    @FXML
    void showGameTwoAction(ActionEvent event) {
    	try {
    		Parent root = FXMLLoader.load(getClass().getResource("GameTwo.fxml"));
    		bttGame2.getScene().setRoot(root);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    @FXML
    void bttBefore() {
    	c1.setLayoutX(c1.getLayoutX()+10);
    }
    public Circle getC1() {
    	return c1;
    }

    @FXML
    void playGameOne(ActionEvent event) {
    	th1.start();
    }
    @FXML
    void playGameTwo(ActionEvent event) {

    	th2.start();
    }
    public void motionGame1() {
    	
    	c1.setLayoutX(c1.getLayoutX() + dx);
    	c1.setLayoutY(c1.getLayoutY() + dy);
    	Bounds bounds = paneGameOne.getBoundsInLocal();
    	if(hitRightOrLeftEdgeCircleOne(bounds))
    		dx *= -1;
    	if(hitTopOrBottomCircleOne(bounds)) {
    		dy *= -1;
    	}
    	
    }
    public void motionGame2() {
    	c2.setLayoutY(c2.getLayoutY() + dyCircle2);
    	Bounds bounds = paneGameTwo.getBoundsInLocal();
    	c3.setLayoutY(c3.getLayoutY() + dyCircle3);
    	c4.setLayoutY(c4.getLayoutY() + dyCircle4);
    	if(hitTopOrBottomCircleTwo(bounds)) {
    		dyCircle2 *= -1;
    	}
    	if(hitTopOrBottomCircleThree(bounds)) {
    		dyCircle3 *= -1;
    	}
    	if(hitTopOrBottomCircleFour(bounds)) {
    		dyCircle4 *= -1;
    	}
    }
    
    private boolean hitRightOrLeftEdgeCircleOne(Bounds bounds) {
        return (c1.getLayoutX() <= (bounds.getMinX() + c1.getRadius())) ||
           (c1.getLayoutX() >= (bounds.getMaxX() - c1.getRadius()));
     }
    private boolean hitTopOrBottomCircleOne(Bounds bounds) {
        return (c1.getLayoutY() <= (bounds.getMinY() + c1.getRadius())) ||
           (c1.getLayoutY() >= (bounds.getMaxY() - c1.getRadius()));
     }
    private boolean hitTopOrBottomCircleTwo(Bounds bounds) {
        return (c2.getLayoutY() <= (bounds.getMinY() + c2.getRadius())) ||
           (c2.getLayoutY() >= (bounds.getMaxY() - c2.getRadius()));
     }
    private boolean hitTopOrBottomCircleThree(Bounds bounds) {
        return (c3.getLayoutY() <= (bounds.getMinY() + c3.getRadius())) ||
           (c3.getLayoutY() >= (bounds.getMaxY() - c3.getRadius()));
     }
    private boolean hitTopOrBottomCircleFour(Bounds bounds) {
        return (c4.getLayoutY() <= (bounds.getMinY() + c4.getRadius())) ||
           (c4.getLayoutY() >= (bounds.getMaxY() - c4.getRadius()));
     }
    @FXML
    void beforeGameOneAction(ActionEvent event){
    	try {
        	th1.interrupt();
        	c1.setLayoutX(182);
        	c1.setLayoutY(158);
        	Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));
        	bttBeforeOne.getScene().setRoot(root);
    	}catch(Exception e) {
    		
    	}

    	
    }
    @FXML
    void beforeGameTwoAction(ActionEvent event) {
    	try {
    		th2.interrupt();
    		c3.setLayoutX(309);
    		c3.setLayoutY(365);
    		c4.setLayoutX(666);
    		c4.setLayoutX(376);
    		c2.setLayoutX(1022);
    		c2.setLayoutX(376);
        	Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));
        	bttBeforeTwo.getScene().setRoot(root);
    	}catch(Exception e) {
    		
    	}
    }
}