import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        short port = 6666;

        try(ServerSocket srv = new ServerSocket(port)){
            while(true) {
                Socket s = srv.accept();
                System.out.print("new connection accepted: ");
                System.out.println(s.getInetAddress());
                new Thread(new Server(s)).start();
            }
        }
    }
}