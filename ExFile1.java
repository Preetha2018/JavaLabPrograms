import java.io.*;
class ExFile1
{
        public static void main(String argv[])
        {

File f = new File(argv[0]); // to get file/directory name from command prompt
                if (f.exists())
                {
                       System.out.println("Name   : " + f.getName());
                        System.out.println("Parent : " + f.getParent());
   System.out.println("Path   : " + f.getAbsolutePath());
                        System.out.println("Length : " + f.length());
                        System.out.println("isFile : " + f.isFile());
                        System.out.println("Read   : " + f.canRead());
                        System.out.println("Write  : " + f.canWrite());
System.out.println("Last Modified  : " + f.lastModified());
                        }
                else
                        System.out.println("Invalid path ....");
                        }
}