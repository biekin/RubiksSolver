import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Serwer ma za zadanie przyjąć stan kostki i wygerenować dla niego
 * rozwiązanie za pomocą klasy Algo_moves2x2x2 i funkcji
 * Algorithm oraz je przesłać do klienta
 */
class Server implements Runnable {
    private Scanner in;
    private PrintStream out;
    private Socket s;

    public Server(Socket s) throws IOException {
        this(s.getInputStream(),s.getOutputStream());
        this.s = s;
    }

    public Server(InputStream input, OutputStream output) {
        in = new Scanner(input);
        out = new PrintStream(output);
    }


    public void run(){
        ObjectInputStream ois=null;
        try{ois = new ObjectInputStream(s.getInputStream());
            ArrayList<String> b;
            b = (ArrayList<String>)ois.readObject();
            System.out.println(b);
            String line;
            System.out.println("Zaraz zacznę algorytm");
            line =Algo_moves2x2x2.Algorithm(b);
            System.out.println("Skończyłem");
            System.out.println(line);
            out.println(line);
        }
        catch (Exception e){e.getMessage();};
        while( (!Thread.currentThread().isInterrupted()) && in.hasNextLine() ) {
            String line = in.nextLine();

        }
        try {
            out.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        short port = 6666;

        try(ServerSocket srv = new ServerSocket(port)){
            while(true) {
                Socket s = srv.accept();

                new Thread(new Server(s)).start();
            }
        }
    }
}