import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RLBlock extends Block{
    Path path = new Path(new ArrayList<>(List.of(100.0, 0.0)), new ArrayList<>(List.of(50.0, 50.0)), Color.blue);
    double x;
    double y;
    double width;
    double height;
    RLBlock(double x, double y, double width, double height){
        super(new Path(new ArrayList<>(List.of(0.0, 100.0)), new ArrayList<>(List.of(50.0, 50.0)), Color.blue), x, y, width, height);
    }
}
