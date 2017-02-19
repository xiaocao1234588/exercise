package com.jerrycao.exercise.book;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by JerryCao on 2017/2/19.
 */
public class E4_1 {
    private static final String INCLUDE = "#include";
    private static Set<String> readFiles = new HashSet<String>();

    private String processFile(String fileName){
        fileName = fileName.trim();
        if(readFiles.contains(fileName)){
            //循环include，则直接返回
            return "######Error to read " + fileName +"\n";
        }

        BufferedReader reader = null;
        StringBuilder sb = new StringBuilder();
        try {
            readFiles.add(fileName);
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine())!=null){
                int index = line.indexOf(INCLUDE);
                if(index>=0){
                    String file = line.substring(index+INCLUDE.length());
                    line = processFile(file);
                    sb.append(line);
                }else {
                    sb.append(line + "\n");
                }
            }
            readFiles.remove(fileName);
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return null;
    }
}
