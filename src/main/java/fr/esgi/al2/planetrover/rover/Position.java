package fr.esgi.al2.planetrover.rover;

public class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void goNorth(){
        this.y++;
    }
    public void goSouth(){
        this.y--;
    }
    public void goEast(){
        this.x++;
    }
    public void goWest(){
        this.x--;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
