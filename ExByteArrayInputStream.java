import java.io.*;

class ExByteArrayInputStream
{
        public static void main(String argv[]) throws Exception
        {
         String s = "This is a Sample Text";

                byte[] b = s.getBytes();
                                                               
ByteArrayInputStream in = new ByteArrayInputStream(b);

                int i;

                while ((i=in.read()) != -1)
                        System.out.println(i);

                in.close();
                }
        }