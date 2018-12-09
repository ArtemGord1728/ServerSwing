package ClientServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    ServerSocket server;
    int port;

    public Server(int port) {
        this.port = port;
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {

        }
    }

    public boolean connect()
    {
        try {
            Socket socket = server.accept();

            if(socket.isConnected())
                return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
