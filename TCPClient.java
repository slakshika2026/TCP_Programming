import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TCPClient {
   public static void main(String[] args) throws IOException {
      Socket socket = new Socket("localhost", 8080);
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      out.println("Hello, Server!");

      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String response = in.readLine();

      System.out.println("Server response: " + response);

      socket.close();
      
   }
}