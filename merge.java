public class FileMerge{
public static void main(string[] args)
throws IOexception{
PrintWriter pw = new
PrintWriter("file3.txt");
BufferedReader br1 = new BufferedReader(new FileReader("File1.txt"));
BufferedReader br2 = new BufferedReader(new FileReader("file2.text"));
String line1 = br1.readline();
String line2 = br2.readline();
while(line!=null || line2!=null){
if(line1!=null)
{
pw.println(line1);
line1 = br1.readline();
}
if(line2!=null)
{
pw.println(line2);
line2 = br2.readline();
}
}
pw.flush();
br1.close();
br2.close();
pw.close();
System.out.println("Merged file1.txt and file2.txt alternatively into file3.ttxt");
}
}

