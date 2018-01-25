import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;

public class Area {

    private int X;
    private int Y;

    public Area(int x, int y){
        X=x;
        Y=y;
    }

    public Color readColor(PixelReader pxrdr, int index){
        Color clr = pxrdr.getColor(X,Y);
        return clr;
    }
}