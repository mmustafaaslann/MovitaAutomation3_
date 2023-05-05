package readers.property;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    Properties prop = new Properties();
<<<<<<< HEAD
    FileReader fileReader;
    FileWriter fileWriter;
    String file;

    public static PropertyReader propertyReader(){
        return propertyReader("config");
    }

    public static PropertyReader propertyReader(String fileName){
        return new PropertyReader(fileName);
    }

    private PropertyReader(String fileName){
        try {
            this.file = "src/test/resources/datafiles/" + fileName + ".properties";
=======
    String file;

    public static PropertyReader read(){
        return read("config");
    }

    public static PropertyReader read(String fileName){
        return new PropertyReader(fileName);
    }

    public PropertyReader(String fileName){
        try {
            file = "src/test/resources/datafiles/" + fileName + ".properties";
>>>>>>> 8245ab7e4f38d4e4d227ab46a65ba0b559de431b
            FileReader fileReader = new FileReader(file);
            prop.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String get(String key){
        return prop.getProperty(key);
    }


    public void set(String key, String value){
        prop.setProperty(key, value);
    }


    public void del(String key){
        prop.remove(key);
    }

    public void store(String comment){
        try {
<<<<<<< HEAD
            fileWriter = new FileWriter(file);
=======
            FileWriter fileWriter = new FileWriter(file);
>>>>>>> 8245ab7e4f38d4e4d227ab46a65ba0b559de431b
            prop.store(fileWriter, comment);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> 8245ab7e4f38d4e4d227ab46a65ba0b559de431b
