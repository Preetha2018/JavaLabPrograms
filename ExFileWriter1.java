 
import java.lang.*;
import java.io.*;

class ExFileWriter1
{
        public static void main(String[] sun) throws IOException
        {
        DataInputStream dis=new DataInputStream(System.in);

//FileWriter(String pathname,boolean appendmode);

                FileWriter fw=new FileWriter(sun[0],true);
                BufferedWriter br=new BufferedWriter(fw);

                String str=null;
                int size;
                try
                {
                while( true )
                {
                        str=dis.readLine();
                        if(str.equals("null"))
                           break;
                        size=str.length();
                        br.write(str,0,size);
                        br.write("\n");
                }

                br.close();
                fw.close();
             }
             catch(Exception e)
             {
               System.out.println(e);
               }
        }
}
