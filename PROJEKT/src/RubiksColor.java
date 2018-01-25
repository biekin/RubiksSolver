import javafx.scene.paint.Color;

public class RubiksColor {

    private double min_red;
    private double min_green;
    private double min_blue;

    private double max_red;
    private double max_green;
    private double max_blue;

    private double eps = 66;

    int index;

    public RubiksColor(Color c, int i){
        min_red=c.getRed()*255-eps;
        min_green=c.getGreen()*255-eps;
        min_blue=c.getBlue()*255-eps;

        max_red=c.getRed()*255+eps;
        max_green=c.getGreen()*255+eps;
        max_blue=c.getBlue()*255+eps;

        index=i;
    }

    public boolean belongs(Color c){
        double r=c.getRed()*255;
        double g=c.getGreen()*255;
        double b=c.getBlue()*255;

        if(r>min_red && r<max_red && g>min_green && g<max_green && b>min_blue && b<max_blue) return true;
        else return false;
    }

    public int getIndex() {
        return index;
    }

}
