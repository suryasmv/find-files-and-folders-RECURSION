import java.io.File;

public class FindFilesRecursion {

    static int Dirs, Files;

    //function to find the files and folders
    static void find(File file){
        if(file.isFile()){
            //print file path
            System.out.println("---- FILE ---- "+file.getAbsolutePath());
            Files++;
        } else {
            if(file.isDirectory()){
                //print folder path
                System.out.println("---- DIRECTORY ---- "+file.getAbsolutePath());
            }
            Dirs++;
            File[] files = file.listFiles();
            for(File file1 : files){
                //recursive call
                find(file1);
            }
        }
    }

    public static void main(String[] args) {
        String filepath = "S:\\Machine learning and Data science"; //path to find files and folders present in
        File file = new File(filepath);
        find(file);
        System.out.println("NUMBER OF DIRS : "+Dirs); //total folders
        System.out.println("NUMBER OF FILES : "+Files); //total files
    }
}