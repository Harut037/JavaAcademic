package exceptions;


import abstract_class_and_interface.homework_7.B;

import java.io.*;

public class ReadFile {


    /**
     * This method writing in the file, after reads in that file and print all information.
     * @param text
     * @throws IOException
     */
    public void printFileContains(String text) throws IOException {
        File file = new File("newFile.txt");
       try {
           if (!file.exists()){
               file.createNewFile();
           }
           FileWriter fileWriter = new FileWriter(file);
           FileReader fileReader = new FileReader(file);
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           bufferedWriter.write(text);
           bufferedWriter.flush();
           bufferedWriter.close();

           System.out.print("\nFile contains this string:   ");
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           while (bufferedReader.ready()){
               System.out.println(bufferedReader.readLine());
           }
       } catch (IOException e){
           System.out.println("\n Error file is exists");
       }
    }

}
