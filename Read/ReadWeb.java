package Read;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class ReadWeb {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection urlConnection = url.openConnection();

            InputStream inputStream = urlConnection.getInputStream();
            ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
            ByteBuffer buffer = ByteBuffer.allocate(64);
            String line = null;
            while(readableByteChannel.read(buffer)>0){
                System.out.println(line);
                buffer.clear();
            }
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
}