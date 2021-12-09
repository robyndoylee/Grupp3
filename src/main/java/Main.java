import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory();
        Terminal terminal = terminalFactory.createTerminal();

        terminal.setCursorVisible(false);
        /*
        Print out "player 1"
        String message = "Player 1";
        for (int i = 0; i < message.length(); i++) {
            terminal.setCursorPosition(i, 14);
            terminal.putCharacter(message.charAt(i));
        }
        terminal.flush();

       Scan for userName
        String userName = scanner.nextLine();
        */

        Player player = new Player("Robyn");
        terminal.setCursorPosition(player.getV(), player.getH());
        terminal.putCharacter(player.tjar);

        boolean continueReadingInput = true;
        while (continueReadingInput) {

            KeyStroke keyStroke = null;
            do {
                Thread.sleep(5);
                keyStroke = terminal.pollInput();
            } while (keyStroke == null);

            KeyType type = keyStroke.getKeyType();
            Character c = keyStroke.getCharacter();
            System.out.println("keyStroke.getKeyType(): " + type
                    + " keyStroke.getCharacter(): " + c);

            if (c == Character.valueOf('q')) {
                continueReadingInput = false;
                terminal.close();
                System.out.println("quit");
            }
            int oldV = player.getV();
            int oldH = player.getH();

            // metod i player istället?
            switch (keyStroke.getKeyType()) {
                case ArrowRight:
                    player.setV(player.getV()+1) ;
                    break;
                case ArrowLeft:
                    player.setV(player.getV()-1);
                    break;
                case ArrowDown:
                    player.setH(player.getH()+1);
                    break;
                case ArrowUp:
                    player.setH(player.getH()-1);
                    break;
            }
            terminal.setCursorPosition(oldV, oldH); // move cursor to old position
            terminal.putCharacter(' '); // clean up by printing space on old position
            terminal.setCursorPosition(player.getV(), player.getH());
            terminal.putCharacter(player.tjar);

            terminal.flush();
        }
    }
}
// X = V
// Y = H

