import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cli
{
    public static final int PORT=6666;
    public static final String HOST = "127.0.0.1";
    public static void main(String[] argv) throws Exception{
        ArrayList<String> tryState =new ArrayList<String>(Arrays.asList(
                "3","6","4","6",
                "3","2","1","5",
                "3","2","4","6",
                "5","4","2","3",
                "1","5","2","6",
                "1","1","4","5"));
        Communication(tryState);
    }
    public static String Communication(ArrayList<String> State) throws Exception
    {
        String pass;
        Socket sock;
        PrintWriter out;
        BufferedReader in;
        String inputLine;
        ObjectOutputStream oos = null;


        int dis = 0;
        String used;

            sock = new Socket("localhost", PORT);
 //           System.out.println("Nawiazalem polaczenie: " + sock);

            //tworzenie strumieni danych  i dostarczanych do socketu
//            out = new PrintWriter(sock.getOutputStream(), true);
            oos = new ObjectOutputStream(sock.getOutputStream());

            //komunikacja - czytanie danych z klawiatury i przekazywanie ich do strumienia
 //           System.out.print("<Wysylamy:> ");
//            out.println(used);
            oos.writeObject(State);
            in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

            inputLine = in.readLine();
            System.out.print(inputLine);
            //zamykanie polaczenia
            oos.close();
            sock.close();
            in.close();
    return inputLine;
                }

    }


