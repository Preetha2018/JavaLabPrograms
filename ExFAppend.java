import java.io.*;

class ExFAppend
{
        public static void main(String argv[]) throws IOException
        {
               FileOutputStream fout = new FileOutputStream("myfile1.txt",true); 

                DataInputStream din = new DataInputStream(System.in);

//                System.out.println("Enter any Text : ");
                String s = "This is a sample text";
//                String s = din.readLine();

                s = "\n" + s;

                byte[] b = s.getBytes();
                fout.write(b);
                fout.close();
                }
        }
