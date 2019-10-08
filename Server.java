// The skeleton program for Server
import java.net.*;
import java.io.*;

public class Server
{
	//input stream defined
	private Socket socket = null;
	private ServerSocket server = null;
	private DataInputStream in = null;
	
	public Server (int port)
	{
		try
		{
			server = new ServerSocket(port);
			system.out.println("Server Started");
			
			System.out.println("Waiting for a client to connect...");
			
			socket = server.accept();
			System.out.println("Client connection accepted");
			
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			String line = "";

			While(!line.equals("Done"))
			{
				try
				{
					line = in.readUTF();
					system.out.println(line);
				}
				
				catch(IOExeption i)
				{
					system.out.println(i);
				}
				
				socket.close();
				in.close();
			}
		}
		
		catch(IOException i)
		{
			system.out.println(i);
		}
	}
}

    public static void main(String args[])
    {
        Server server = new Server(5000);
    }
}
