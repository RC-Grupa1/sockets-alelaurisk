import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = "100.81.180.78";
        int port = 5000;

        try (
                Socket socket = new Socket(host, port);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8)
                );
                BufferedWriter out = new BufferedWriter(
                        new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8)
                );
                Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("Conectat la server.");

            while (true) {
                // clientul trimite primul mesaj
                System.out.print("Client: ");
                String message = scanner.nextLine();

                out.write(message);
                out.newLine();
                out.flush();

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Clientul a inchis conversatia.");
                    break;
                }

                // clientul asteapta raspuns de la server
                String response = in.readLine();

                if (response == null) {
                    System.out.println("Serverul s-a deconectat.");
                    break;
                }

                System.out.println("Server: " + response);

                if (response.equalsIgnoreCase("exit")) {
                    System.out.println("Serverul a inchis conversatia.");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}