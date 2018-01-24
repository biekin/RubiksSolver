import javafx.scene.image.Image;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class PicToArr {
    public static ArrayList<String> toArr(String pic, String pic2){
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
                "5","2","1","4",
                "5","2","2","2",
                "3","4","3","3",
                "1","4","6","4",
                "5","5","1","3",
                "1","6","6","6"));

      out = tryState;
      return out;
    }

}
