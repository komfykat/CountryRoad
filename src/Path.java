import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Path {
    private ArrayList<Double> Xs;
    private ArrayList<Double> Ys;
    Color color;
    public int n;
    Block block;
    public Path(ArrayList<Double> xs, ArrayList<Double> ys, Color color) {
        Xs = xs;
        Ys = ys;
        n = Xs.size();
        this.color = color;
    }
    public Path(ArrayList<Double> xs, ArrayList<Double> ys) {
        Xs = xs;
        Ys = ys;
        n = Xs.size();
        this.color = new Color(0, 0, 0, 1);
    }
    public Path(){
    }

    public ArrayList<Double> getXs() {
        return Xs;
    }

    public void setXs(ArrayList<Double> xs) {
        Xs = xs;
    }

    public ArrayList<Double> getYs() {
        return Ys;
    }

    public void setYs(ArrayList<Double> ys) {
        Ys = ys;
    }
    public void paint(Graphics g){
        for (int i = 0; i < n; ++i){
            g.setColor(color);
            g.fillRect(Xs.get(i).intValue() - 2 + (int) block.x, Ys.get(i).intValue() - 2 + (int) block.y, 4, 4);
        }
    }
}
