import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ColorGetter {

    /*PHOTOS MUST BE:

    -of ratio 16:9
    -vertical only
    -not deformated (f.e. "fish eye" or sth)
    -both taken in the same light
    -without a shade on the cube

    RECOMENED:
    -slightly bigger contrast&saturation
    -resolition min 720x1280


     */

    private int requested_height = 1280;
    private int requested_width = 720;
    private static ArrayList<RubiksColor> colors = new ArrayList<>();
    private static ArrayList<Area> areas = new ArrayList<>();
    private static ArrayList<String> state = new ArrayList<>();
    private static ArrayList<String> tmp = new ArrayList<>();
    private static ArrayList<Integer> counters = new ArrayList<>();

    private PixelReader pixread;

    private Image f1, f2;

    private int colorIndex;

    public ColorGetter(String file1, String file2) throws FileNotFoundException{

        // initializing object

        colorIndex=1;
        GenerateAreas();
        FrontPhoto(file1);
        BackPhoto(file2);

    }

    public ArrayList<String> getState() throws PoorPhotoException {

        pixread=f1.getPixelReader();

        //Getting the colors in the RIGHT ORDER for the algorithm

        state.add(Integer.toString(GetColor(areas.get(4))));
        state.add(Integer.toString(GetColor(areas.get(5))));
        state.add(Integer.toString(GetColor(areas.get(9))));
        state.add(Integer.toString(GetColor(areas.get(8))));
        state.add(Integer.toString(GetColor(areas.get(6))));
        state.add(Integer.toString(GetColor(areas.get(7))));
        state.add(Integer.toString(GetColor(areas.get(11))));
        state.add(Integer.toString(GetColor(areas.get(10))));

        tmp.add(Integer.toString(GetColor(areas.get(0))));
        tmp.add(Integer.toString(GetColor(areas.get(2))));
        tmp.add(Integer.toString(GetColor(areas.get(3))));
        tmp.add(Integer.toString(GetColor(areas.get(1))));

        pixread=f2.getPixelReader();

        state.add(Integer.toString(GetColor(areas.get(11))));
        state.add(Integer.toString(GetColor(areas.get(10))));
        state.add(Integer.toString(GetColor(areas.get(6))));
        state.add(Integer.toString(GetColor(areas.get(7))));
        state.add(Integer.toString(GetColor(areas.get(9))));
        state.add(Integer.toString(GetColor(areas.get(8))));
        state.add(Integer.toString(GetColor(areas.get(4))));
        state.add(Integer.toString(GetColor(areas.get(5))));

        state.add(tmp.get(0));
        state.add(tmp.get(1));
        state.add(tmp.get(2));
        state.add(tmp.get(3));

        tmp.clear();

        state.add(Integer.toString(GetColor(areas.get(1))));
        state.add(Integer.toString(GetColor(areas.get(0))));
        state.add(Integer.toString(GetColor(areas.get(2))));
        state.add(Integer.toString(GetColor(areas.get(3))));

        // chcecking if te state was read correctly


        if(colors.size()!=6){
            throw new PoorPhotoException("I found wrong number of colours. Gimmie better photos.");
        }
        for(Integer counter : counters){
            if (!counter.equals(4)){
                throw new PoorPhotoException("I found wrong number of squares of a color, gimmie better photos.");
            }
        }

        return state;
    }

    private void FrontPhoto(String path) throws FileNotFoundException { //loading front photo

        f1 = new Image(new FileInputStream(path),
                requested_width,
                requested_height,
                false,
                false);
    }

    private void BackPhoto(String path) throws FileNotFoundException { //loading back photo

        f2 = new Image(new FileInputStream(path),
                requested_width,
                requested_height,
                false,
                false);
    }

    private int GetColor(Area a){

        Color currentColor = a.readColor(pixread, colorIndex);
        int currentColorIndex = 0;

        int i=0;
        for(RubiksColor rcolor : colors){
            if(rcolor.belongs(currentColor)){
                currentColorIndex=rcolor.getIndex();
                counters.set(i, counters.get(i)+1);
                return currentColorIndex;
            }
            i++;
        }
        colors.add(new RubiksColor(currentColor,colorIndex));
        currentColorIndex=colorIndex;
        counters.add(1);
        colorIndex++;


        return currentColorIndex;
    }

    private void GenerateAreas(){

        areas.add(new Area(360,374));  //a  0
        areas.add(new Area(200, 444)); //b  1
        areas.add(new Area(520,444)); //c 2
        areas.add(new Area(360,548)); //d  3
        areas.add(new Area(130,584)); //e  4
        areas.add(new Area(264,688)); //f  5
        areas.add(new Area(472,694)); //g 6
        areas.add(new Area(602,572)); //h  7
        areas.add(new Area(168,720)); //i 8
        areas.add(new Area(286,830)); //j  9
        areas.add(new Area(438, 844));//k 10
        areas.add(new Area(570,726)); //l  11
    }
}
