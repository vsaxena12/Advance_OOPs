package driver;
import CharacterEncoding.ByteStream;
import CharacterEncoding.IODemoEncoding;

public class DriverFileTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IODemoEncoding io = new IODemoEncoding();
		//io.applyEncoding();
		
		ByteStream stream = new ByteStream();
		stream.fileCopyWithBufferAndArray();
		//System.out.println(System.getProperty("file.encoding"));
	}

}
