import com.sun.jdi.LocalVariable;

import java.io.*;
import java.rmi.server.ExportException;
import java.time.LocalTime;

public class MainProgram {
    public static void main(String[] args) throws IOException {
        String cwd = System.getProperty("user.dir");
        String fileSep = System.getProperty("file.separator");

        String path = "C:" + fileSep + "User";
        System.out.println(cwd + " " + fileSep + " " + path);

        System.out.println(cwd);


//        File newDir = new File("newDir");
//        newDir.mkdir();
//        File newFile = new File("newDir"+fileSep+"test.txt");
//        for (String fileName : newDir.list()){
//            System.out.println(fileName);
//        }
//        try {
//            if (newFile.createNewFile()) {
//                System.out.println(newFile.getAbsolutePath());
//            }else {
//                System.out.printf("else");
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try {
////            FileWriter fileWriter = new FileWriter(newFile, true);
////            BufferedWriter bw = new BufferedWriter(fileWriter);
////            bw.write(String.valueOf(LocalTime.now()));
////            bw.newLine();
////            bw.close();
////            fileWriter.close();
//
//            PrintWriter pw = new PrintWriter(new FileWriter(newFile, true));
//            pw.printf("[%s] %s\n", LocalTime.now(), newFile.getAbsolutePath());
//            pw.close();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(newFile));
//            String line = "";
//            while ((line = br.readLine()) != null){
//                System.out.println(line);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
