import org.w3c.dom.Entity;

import java.awt.image.BufferedImage;

public class Wall {

    Position[] obstacles = new Position[78];



    //String wall = "----- ---------------------------------";
    for (Position p : obstacles) {
        obstacles[] = block;

    }
    Random r = new Random();
    obstacles[r] = ' ';
    obstacles[r+1] = ' ';


     //create obstacles array

    for (int i = 0; i<78; i++) {
        obstacles[i] = new Position(0+i);

    // For main
    // use obstacles array to print to lanterna

    /*
     //Task 12
        Random r = new Random();
        Position bombPosition = new Position(r.nextInt(80), r.nextInt(24));
        terminal.setCursorPosition(bombPosition.x, bombPosition.y);
        terminal.putCharacter(bomb);

    }

     */


    }

    public int[] getObstacles() {
            return obstacles;
    }