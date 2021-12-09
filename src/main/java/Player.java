public class Player {
    int H = 10;
    int V = 10;
    String userName;
    final char tjar = 'X';

    public Player(String userName) {
        this.userName = userName;
    }

    public int getV() {
        return V;
    }

    public void setV(int V) {
        this.V = V;
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }

}
