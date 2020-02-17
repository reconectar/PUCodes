import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

import org.simpleframework.http.Request;
import org.simpleframework.http.Response;
import org.simpleframework.http.core.Container;
import org.simpleframework.http.core.ContainerSocketProcessor;
import org.simpleframework.transport.connect.Connection;
import org.simpleframework.transport.connect.SocketConnection;

public class Server implements Container{
	
	private ContainerSocketProcessor server;
	private SocketAddress adress;
	private Connection connection;
	public static final int PORT = 18040; 
	
	public Server() throws IOException {
		server = new ContainerSocketProcessor(this);
		connection = new SocketConnection(server);
		adress = new InetSocketAddress(PORT);
		connection.connect(adress);
		System.in.read();
	}	

	@Override
	public void handle(Request req, Response res) {
		try {
			PrintStream body = res.getPrintStream();
			body.println("<a href=\"http:\\\\www.pudim.com.br\">ola mundo</a>");
			body.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
