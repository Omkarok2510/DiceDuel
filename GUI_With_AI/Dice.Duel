import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class DiceDuel extends Application {

    private static final String[] DICE_IMAGES = {
            "/dice1.png", "/dice2.png", "/dice3.png",
            "/dice4.png", "/dice5.png", "/dice6.png"
    };

    private ImageView playerDice, computerDice;
    private Text resultText;
    private Text rollText;
    private Random random = new Random();

    private String playerName = "Player";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Ask for player name
        TextInputDialog dialog = new TextInputDialog("Player");
        dialog.setTitle("Player Name");
        dialog.setHeaderText("Enter your name:");
        dialog.setContentText("Name:");
        dialog.showAndWait().ifPresent(name -> playerName = name);

        // UI Elements
        Button rollButton = new Button("Roll Dice");
        rollButton.setFont(Font.font(18));
        rollButton.setOnAction(e -> rollDice());

        playerDice = createDiceView();
        computerDice = createDiceView();

        resultText = new Text("Click Roll to start!");
        resultText.setFont(Font.font(20));

        rollText = new Text("");
        rollText.setFont(Font.font(16));

        HBox diceBox = new HBox(50, playerDice, computerDice);
        diceBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(20, diceBox, rollButton, rollText, resultText);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 550, 400);
        primaryStage.setTitle("Dice Duel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private ImageView createDiceView() {
        ImageView iv = new ImageView();
        iv.setFitWidth(100);
        iv.setFitHeight(100);
        iv.setImage(new Image(getClass().getResourceAsStream(DICE_IMAGES[0])));
        return iv;
    }

    private void rollDice() {
        int playerRoll = random.nextInt(6) + 1;
        int computerRoll = random.nextInt(6) + 1;

        playerDice.setImage(new Image(getClass().getResourceAsStream(DICE_IMAGES[playerRoll - 1])));
        computerDice.setImage(new Image(getClass().getResourceAsStream(DICE_IMAGES[computerRoll - 1])));

        rollText.setText(playerName + " rolled: " + playerRoll + " | Computer rolled: " + computerRoll);

        if (playerRoll > computerRoll) {
            resultText.setText(playerName + " wins!");
        } else if (computerRoll > playerRoll) {
            resultText.setText("Computer wins!");
        } else {
            resultText.setText("It's a tie!");
        }
    }
}
