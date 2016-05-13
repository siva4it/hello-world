

import java.io.File;

/**
 * Contains some methods to list files and folders from a directory
 *
 * @author Loiane Groner
 * http://loiane.com (Portuguese)
 * http://loianegroner.com (English)
 */
public class ListFilesUtil {
public static void main (String[] args){

        ListFilesUtil listFilesUtil = new ListFilesUtil();

        //Windows directory example
        final String directoryWindows ="E://Forms Development";

        listFilesUtil.listFilesAndFilesSubDirectories(directoryWindows);
    }
    /**
     * List all the files and folders from a directory
     * @param directoryName to be listed
     */
    public void listFilesAndFolders(String directoryName){

        File directory = new File(directoryName);

        //get all the files from a directory
        File[] fList = directory.listFiles();

        for (File file : fList){
            System.out.println(file.getName());
        }
    }

    /**
     * List all the files under a directory
     * @param directoryName to be listed
     */
    public void listFiles(String directoryName){

        File directory = new File(directoryName);

        //get all the files from a directory
        File[] fList = directory.listFiles();

        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }
    }

    /**
     * List all the folder under a directory
     * @param directoryName to be listed
     */
    public void listFolders(String directoryName){

        File directory = new File(directoryName);

        //get all the files from a directory
        File[] fList = directory.listFiles();

        for (File file : fList){
            if (file.isDirectory()){
                System.out.println(file.getName());
            }
        }
    }

    /**
     * List all files from a directory and its subdirectories
     * @param directoryName to be listed
     */
    public void listFilesAndFilesSubDirectories(String directoryName){

        File directory = new File(directoryName);

        //get all the files from a directory
        File[] fList = directory.listFiles();

        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getName());
            } else if (file.isDirectory()){
            	System.out.println("\t"+file.getName()+"\n");
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
            }
        }
    }

    
}
