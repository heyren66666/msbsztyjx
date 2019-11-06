import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Java240 {
    public static void main(String[] args)throws Exception{
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("D:\\IDEA\\msbsztyjx\\src\\testInput.txt");
            int data=fis.read();
            while (data!=-1){
                System.out.print(Integer.toHexString(data));
                data=fis.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try{
                    fis.close();
                }catch (IOException e){
                }
            }
        }
        System.out.println();
        FileReader reader=null;
        try{
            reader=new FileReader("D:\\IDEA\\msbsztyjx\\src\\testInput.txt");
            int character=reader.read();
            while (character !=-1){
                System.out.print((char)character);
                character=reader.read();
            }
        }catch (IOException io){
            System.out.println("Failed to read character data from File");
            io.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                }catch (IOException e){

                }
            }
        }
    }
}
