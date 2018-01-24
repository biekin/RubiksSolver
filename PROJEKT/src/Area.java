import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;

public class Area {

    private int X;
    private int Y;
    private int R;

    public Area(int x, int y, int r){
        X=x;
        Y=y;
        R=r;
    }

    public Color readColor(PixelReader pxrdr, int index){
        if(R==1){
            Color clr = pxrdr.getColor(X,Y);
            return clr;
        }
        //return new RubiksColor(new Color(0,0,0,1),index);
        return new Color(0,0,0,1);
    }
}
