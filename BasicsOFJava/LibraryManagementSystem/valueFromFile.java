package BasicsOFJava.LibraryManagementSystem;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class valueFromFile {
    final static String filePath = "E:/Hero Vired/BasicsOFJava/LibraryManagementSystem/BookList.csv";

    public static void main(String[] args) {

        // read text file to HashMap
        HashMap<String, List<String>> mapFromFile = HashMapFromTextFile();

        // iterate over HashMap entries
        for (Entry<String, List<String>> entry : mapFromFile.entrySet()) {
            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }

        System.out.println(mapFromFile.get("101"));
        List<String> val = mapFromFile.get("101");
        val.set(0, "HTML CSS AND JS");
        mapFromFile.put("101", val);
        System.out.println(mapFromFile);
        //HashMapToTextFile(mapFromFile);
    }

    public static HashMap<String, List<String>> HashMapFromTextFile() {

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        BufferedReader br = null;

        try {

            // create file object
            File file = new File(filePath);

            // create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));

            String line = null;

            // read file line by line
            while ((line = br.readLine()) != null) {

                // split the line by :
                ArrayList<String> values = new ArrayList<>();
                String[] parts = line.split(",");

                // first part is name, second is number
                String bookId = parts[0].trim();
                values.add(parts[1]);
                values.add(parts[2]);
                values.add(parts[3]);
                values.add(parts[4]);

                if (!bookId.equals(""))
                    map.put(bookId, values);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
                ;
            }
        }

        return map;
    }
    public static void HashMapToTextFile(Map<String, List<String>> map) {

        File file = new File(filePath);
  
        BufferedWriter bf = null;
  
        try {
  
            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));
  
            // iterate map entries
            for (Map.Entry<String, List<String>> entry :
                 map.entrySet()) {
  
                // put key and value separated by a colon
                bf.append(entry.getKey())
                   .append(',')
                   .append(entry.getValue().get(0))
                   .append(',')
                   .append(entry.getValue().get(1))
                   .append(',')
                   .append(entry.getValue().get(2))
                   .append(',')
                   .append(entry.getValue().get(3));
  
                // new line
                bf.newLine();
            }
  
            bf.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
  
            try {
  
                // always close the writer
                bf.close();
            }
            catch (Exception e) {
            }
        }
    }

    }
