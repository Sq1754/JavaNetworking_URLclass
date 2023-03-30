import java.net.*;
import java.io.*;

public class URLClass {
	public static void main(String[]args) {
		try {
			URL url = new URL("https://nptel.ac.in/course.php");
			
			
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host: "+url.getHost());
			System.out.println("Port: "+url.getPort()); // if port number is not mentioned then it will return -1
			System.out.println("File name: "+url.getFile());
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}
}
