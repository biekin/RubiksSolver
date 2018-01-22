import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ColorTest {
    public static void main(String[] args){

        try {
            ColorGetter cg = new ColorGetter();
            ArrayList<String> state =cg.getState();
            System.out.println("sukces?");
            for (String el : state){
                System.out.println(el);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
