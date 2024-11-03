import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class TCPServer {
   public static void main(String[] args) throws IOException {

      ServerSocket serverSocket = new ServerSocket(8080);
      System.out.println("Server is listening on port 8080");

      Socket clientSocket = serverSocket.accept();

      System.out.println("Client connected: ");

      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

      PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);

      String message = in.readLine();
      System.out.println("Client says: " + message);

      out.println("Hello, Client!");

      serverSocket.close();
   }
}
