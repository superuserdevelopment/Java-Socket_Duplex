import java.util.*;
import java.io.*;
//Execute this before user2
public class User1 {
    public static void main(String args[]) {
        int i = 0;
        while (i < 5) {
            Server server = new Server(6000);
            Client client = new Client("127.0.0.1", 5000);
            i++;
        }
    }
}
