import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ColorGetter {

    // PHOTO RATIO 16:9 !!!! VERTICAL ONLY

    private int requested_height = 1280;
    private int requested_width = 720;
//    private int alpha1 = (int)((3./(8*Math.sqrt(3)))*requested_height);
//    private int alpha2 = (int)((Math.sqrt(3)/12)*alpha1);
    private static ArrayList<RubiksColor> colors = new ArrayList<>();
    private  ArrayList<Area> areas = new ArrayList<>();
    private static ArrayList<String> state = new ArrayList<>();
    private static ArrayList<String> tmp = new ArrayList<>();

    private PixelReader pixread;

    private Image f1, f2;

    private int colorIndex;

    public ColorGetter() throws FileNotFoundException{

        colorIndex=1;
//
//        areas.add(new Area((int)(0.5*requested_width), (int)((5./16.)*requested_height), 1));  //A  0
//        areas.add(new Area((int)(0.5*requested_width-0.5*alpha1), (int)((3./8.)*requested_height), 1)); //b  1
//        areas.add(new Area((int)(0.5*requested_width+0.5*alpha1),(int)((3./8.)*requested_height),1)); //c 2
//        areas.add(new Area((int)(0.5*requested_width),(int)((7.0/16.0)*requested_height),1)); //d  3
//        areas.add(new Area((int)(0.5*requested_width - 0.75 * alpha1), (int)(0.5*requested_height + alpha2), 1)); //e  4
//        areas.add(new Area((int)(0.5*requested_width - 0.25 * alpha1), (int)(0.5 * requested_height - alpha2), 1)); //f  5
//        areas.add(new Area((int)(0.5*requested_width - 0.25*alpha1), (int)(0.5*requested_height + alpha2), 1)); //g 6
//        areas.add(new Area((int)(0.5*requested_width + 0.75*alpha1), (int)(0.5 * requested_height - alpha2), 1)); //h  7
//        areas.add(new Area((int)(0.5*requested_width - 0.75*alpha1), (int)((5.0/8.0) * requested_height - alpha2), 1)); //i 8
//        areas.add(new Area((int)(0.5*requested_width - 0.25*alpha1), (int)((5.0/8.0)*requested_height + alpha2), 1)); //j  9
//        areas.add(new Area((int)(0.5*requested_width + 0.25*alpha1), (int)((5.0/8.0)*requested_height + alpha2), 1));//k 10
//        areas.add(new Area((int)(0.5*requested_width + 0.75 * alpha1), (int)((5.0/8.0)*requested_height - alpha2), 1)); //l  11

        areas.add(new Area(360,374, 1));  //a  0
        areas.add(new Area(200, 444,1)); //b  1
        areas.add(new Area(520,444,1)); //c 2
        areas.add(new Area(360,548,1)); //d  3
        areas.add(new Area(130,584,1)); //e  4
        areas.add(new Area(264,688,1)); //f  5
        areas.add(new Area(472,694,1)); //g 6
        areas.add(new Area(602,572,1)); //h  7
        areas.add(new Area(168,720,1)); //i 8
        areas.add(new Area(286,830,1)); //j  9
        areas.add(new Area(438, 844, 1));//k 10
        areas.add(new Area(570,726,1)); //l  11

//        Image image = new Image(new FileInputStream("/home/kb/Java/JavaLabs/RubiksSolver/four.jpg"),
//                requested_width,
//                requested_height,
//                false,
//                true);

      //  ImageView imageView = new ImageView(image);

        f1 = new Image(new FileInputStream("/home/kb/Java/JavaLabs/RubiksSolver/state_2_front.JPG"),
                requested_width,
                requested_height,
                false,
                false);

        f2 = new Image(new FileInputStream("/home/kb/Java/JavaLabs/RubiksSolver/state_2_back.JPG"),
                requested_width,
                requested_height,
                false,
                false);



//        PixelReader pxrd = image.getPixelReader();
//        Color clr = pxrd.getColor(719,1279);

        pixread=f1.getPixelReader();


//        double red = clr.getRed();
//        double green = clr.getGreen();
//        double blue = clr.getBlue();
//        System.out.println(red*255);
//        System.out.println(green*255);
//        System.out.println(blue*255);
    }

    public ArrayList<String> getState() throws PoorPhotoException {

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

        if(colors.size()>20){
            throw new PoorPhotoException("can't read colors correctly from given photos");
        }

        return state;
    }

    private void FrontPhoto(){

    }

    private void BackPhoto(){

    }

    private int GetColor(Area a){

        Color currentColor = a.readColor(pixread, colorIndex);
        int currentColorIndex = 0;

        for(RubiksColor rcolor : colors){
            if(rcolor.belongs(currentColor)){
                currentColorIndex=rcolor.getIndex();
                return currentColorIndex;
            }
        }
        colors.add(new RubiksColor(currentColor,colorIndex));
        currentColorIndex=colorIndex;
        colorIndex++;

        return currentColorIndex;
    }
}
