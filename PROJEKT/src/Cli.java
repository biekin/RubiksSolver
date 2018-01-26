import java.io.*;
import java.lang.reflect.Array;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** Klasa Cli łączy się z serwerem przekazująć obiekt typu ArrayList<String>,
 * który jest aktualnym stanem kostki.
 * Od serwera otrzymuje rozwiązanie tego układu typu String.
 */
public class Cli implements Runnable
{
    public static final int PORT=6666;
    private ArrayList<String> State;
    private String solution;
    public static final String HOST = "127.0.0.1";

    public Cli(ArrayList<String> state){this.State=state; this.solution="abc"; System.out.print("zrobiłem się");};

    public String GetSolution(){
        System.out.print(this.solution);
        return this.solution;
    }

    @Override
    public void run(){




        String pass;
        Socket sock;
        PrintWriter out;
        BufferedReader in;
        String inputLine;
        ObjectOutputStream oos = null;


        int dis = 0;
        String used;
try {
    System.out.print("cli");
    sock = new Socket("localhost", PORT);
    //           System.out.println("Nawiazalem polaczenie: " + sock);

    //tworzenie strumieni danych  i dostarczanych do socketu
//            out = new PrintWriter(sock.getOutputStream(), true);
    oos = new ObjectOutputStream(sock.getOutputStream());

    //komunikacja - czytanie danych z klawiatury i przekazywanie ich do strumienia

    oos.writeObject(State);
    in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

    this.solution = in.readLine();

            //zamykanie polaczenia
            oos.close();
            sock.close();
            in.close();}
 catch (Exception e){e.getMessage();};
                }

}


