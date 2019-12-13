import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class java247server {
    public static void main(String[] args){
        BufferedReader br=null;
        PrintWriter pw=null;
        ServerSocket server=null;
        try{
            server=new ServerSocket(2000);
            Socket socket=server.accept();
            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw=new PrintWriter(socket.getOutputStream(),true);
            String s=br.readLine();
            pw.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if (br!=null) br.close();
                if (pw!=null) pw.close();
                if (server!=null) server.close();

            }catch (Exception e){

            }
        }
    }
}
