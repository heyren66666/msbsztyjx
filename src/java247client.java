import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class java247client {
    public static void main(String[] args){
        BufferedReader br=null;
        PrintWriter pw=null;
        Socket socket = null;
        try {
            socket = new Socket("localhost", 2000);
            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw=new PrintWriter(socket.getOutputStream());
            pw.println("hello");
            String s=null;
            while (true){
                s=br.readLine();
                if (s!=null){
                    break;
                }
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if (br!=null)br.close();
                if (pw!=null)pw.close();
                if (socket!=null)socket.close();
            }catch (Exception e)
            {

            }
        }



    }
}
