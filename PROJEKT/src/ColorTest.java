import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ColorTest {
    public static void main(String[] args){

        try {
            ColorGetter cg = new ColorGetter(
                    "D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\state_1_back.JPG",
                    "D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\oth_files\\state_1_front.JPG");
            try {
                ArrayList<String> state =cg.getState();
                System.out.println("sukces?");
                for (String el : state){
                    System.out.println(el);
                }

            } catch (PoorPhotoException e){
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}