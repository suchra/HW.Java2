// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;


public class task2 {
  
    public static String readFile(String path) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileInputStream fileStream = new FileInputStream(new File(path));
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
 
        String line;
        while ((line = br.readLine()) != null) {
           sb.append(line+System.lineSeparator()); //   +"," 
        }
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException{
        String filePath = "text.txt";
 
        String content = "";
        try {
            content = readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        // System.out.print(content);
        // System.out.println();
        // System.out.println(content.length());
        // StringBuilder sb1 = new StringBuilder(content);
        StringBuilder sb1 = new StringBuilder();
        for (char i : content.toCharArray()){
                if (i != '\"' ){            //&& i != '\n'
                    sb1.append(i);
                }
        }
        System.out.print(sb1);
        System.out.println();
        String str_sb1 = sb1.toString();
        str_sb1 = str_sb1.replaceAll("[:,\r]", " ");
        String str_sb2 = str_sb1.replaceAll("фамилия", "Студент");
        String str_sb3 = str_sb2.replaceAll("оценка", "получил");
        String str_sb4 = str_sb3.replaceAll("предмет", "по предмету");
       
        System.out.print(str_sb4);
        // String[] result = str_sb1.split(" ");
        
        // // System.out.print(Arrays.toString(result));
                
        // // for (String w : result){
        // //         System.out.print(w);             
        // //     }          
        }   
    }
    
