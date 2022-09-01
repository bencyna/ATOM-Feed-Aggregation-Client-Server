import java.io.*;
import java.net.*;

public class AggregationServer {
    public static void main(String[] args) {
        try {
            while (true) {
                ServerSocket ss = new ServerSocket(6666);
                Socket s=ss.accept();  
                DataInputStream din=new DataInputStream(s.getInputStream());  
                DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
                
                String str="";  
                str=din.readUTF();  
                System.out.println("sever: "+str);  
                dout.writeUTF(sendToClient());  
                dout.flush();  
                ss.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static String sendToClient() {
        return "stromng";
    }
}