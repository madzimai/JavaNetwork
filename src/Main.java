
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException {
        InetAddress google = InetAddress.getByName("www.google.com");
        System.out.println("HOST_ADDRESS :" +google.getHostAddress());
        System.out.println("CLONICIAL_HOST_NAME  :" +google.getCanonicalHostName());
        System.out.println("HOST_NAME  :"+google.getHostAddress());

        google.isReachable(10000);


  }
}
