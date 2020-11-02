import java.util.*;
import java.io.*;

public class User2 {
    public static void main(String args[]) {
        int i = 0;
        while (i < 5) {            
            Client client = new Client("127.0.0.2", 6000);
            Server server = new Server(5000);
            i++;
        }
    }
}
