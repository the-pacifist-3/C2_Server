package ServerPackage;
import java.net.*;


public class RemoteConnections {
	public ServerSocket startSockets(int port) {
		try {
			ServerSocket ss = new ServerSocket(port);
			ss.accept();
			System.out.println("Listening on 127.0.0.1:"+port+"........");
			return ss;
		}catch(Exception e) {
			System.out.println("##--Error in Binding to port "+port+"--##\n"+e);
			return null;
		}
	}public int stopSockets(ServerSocket ss) {
		try {
			if(ss.isClosed()) {
				System.out.println("##--Port already Closed--##");
				return 1;
			}else {
				System.out.println("Closing Port"+ss.getLocalPort()+"\n");
				ss.close();
				return 1;
			}
		}catch(Exception e) {
			System.out.println("##--Error while closing port "+ss.getLocalPort()+"--##\n"+e);
			return -1;
		}
	}
}
