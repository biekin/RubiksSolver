import javafx.scene.image.Image;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class PicToArr {
    public static ArrayList<String> toArr(String pic, String pic2) throws Exception{
      ArrayList<String> out;

        ArrayList<String> State =new ArrayList<String>(Arrays.asList(
                "3","6","4","6",
                "3","2","1","5",
                "3","2","4","6",
                "5","4","2","3",
                "1","5","2","6",
                "1","1","4","5"));
        ArrayList<String> okState =new ArrayList<String>(Arrays.asList(
                "6","1","3","4",
                "6","2","5","4",
                "3","2","5","1",
                "5","2","6","4",
                "1","5","2","3",
                "1","6","4","3"));
        ArrayList<String> tryState =new ArrayList<String>(Arrays.asList(
                "1", "2", "1", "2",
                "3", "4", "3", "4",
                "2", "1", "2", "1",
                "4", "3", "4", "3",
                "5", "5", "5", "5",
                "6", "6", "6", "6"));

        ColorGetter rubikscube = new ColorGetter(pic,pic2);
        System.out.println("1");
        System.out.println();
        out = rubikscube.getState();
              out = tryState;
        return out;
    }

}
