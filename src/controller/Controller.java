package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainWindow;

/**
 *
 * @author Andres Numpaque
 */
public class Controller implements ActionListener {

    private MainWindow mainWindow;

    public Controller() {
        mainWindow = new MainWindow(this);
    }

    public static void main(String[] args) {
        new Controller();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "ok":
                int rounds = Integer.parseInt(mainWindow.getTxtRounds().getText());
                mainWindow.getSierpinskyTriangle().setDepth(rounds);
                mainWindow.openWindowTriangle(true);

                break;
        }
    }

}
