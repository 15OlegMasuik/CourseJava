package gmail.olegmasiuk;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Marta\\Downloads");
        String text =getFolderInfoFile(folder);
        File file = new File("select.txt");
        saveStringToFile(text,file);

    }



    public static void  saveStringToFile(String text, File file){
        try (PrintWriter pw = new PrintWriter(file)){
            pw.println(text);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public  static  String getFileInfo(File file){
        String fileName = file.getName();
        String type="";
        if (file.isFile()){
            type ="file";
        }else{
            type="folder";
        }
        long fileSize =file.length();
        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");
        String result =String.format("%-30.30s\t%-6.6s\t%-12.12s\t%-10.10s", fileName,type,""+fileSize,sdf.format(file.lastModified()));

        return  result;
    }
    public static String getFolderInfoFile(File folder){
        StringBuilder sb=new StringBuilder();
        File[] files =folder.listFiles();
        for (File file:files){
            sb.append(getFileInfo(file));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
