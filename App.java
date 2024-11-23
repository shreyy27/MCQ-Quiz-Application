import screens.CreateQuestionScreenGui;
import screens.TitleScreenGui;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // makes sure the Swing gui tasks are executed on this event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
             public void run() {
                // create and display the title screen gui window
//                new TitleScreenGui().setVisible(true);
                new CreateQuestionScreenGui().setVisible(true);
            }
        });
    }
}
