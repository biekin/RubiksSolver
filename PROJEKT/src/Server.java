import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

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

    private void msg(String msg) {
        System.out.print("SRV: ");
        System.out.println(msg);
    }
    public void run(){
//        msg("serving new connection");
        ObjectInputStream ois=null;
        try{ois = new ObjectInputStream(s.getInputStream());
            ArrayList<String> b;
            b = (ArrayList<String>)ois.readObject();
            System.out.println(b);
            String line;
            line =Algo_moves2x2x2.Algorithm(b);
            System.out.println(line);
            out.println(line);
        }
        catch (Exception e){};
        while( (!Thread.currentThread().isInterrupted()) && in.hasNextLine() ) {
            String line = in.nextLine();
//            msg(line);
//            line =Algo_moves2x2x2.Algorithm();
//            out.println(line);
        }
        try {
            out.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        msg("connection closed");
    }
    public static void main(String[] args) throws IOException {
        short port = 6666;

        try(ServerSocket srv = new ServerSocket(port)){
            while(true) {
                Socket s = srv.accept();
//                System.out.print("new connection accepted: ");
//                System.out.println(s.getInetAddress());
                new Thread(new Server(s)).start();
            }
        }
    }
}