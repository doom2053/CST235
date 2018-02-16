// Mark Piland 
// CST 235
// 2/15/18
// This assignment was completed in collaboration with Robbie Evans III. 
//code received from http://www.techbeamers.com/java-serialization-tutorial/


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationLib {

    // Do serialize the Java object and save it to a file
    public static void doSerialize(Object obj, String outputFile)
            throws IOException {
        FileOutputStream fileTowrite = new FileOutputStream(outputFile);
        ObjectOutputStream objTowrite = new ObjectOutputStream(fileTowrite);
        objTowrite.writeObject(obj);
 
        fileTowrite.close();
    }

    // Do deserialize the Java object from a given file
    public static Object doDeserialize(String inputFile) throws IOException,
            ClassNotFoundException {
        FileInputStream fileToread = new FileInputStream(inputFile);
        ObjectInputStream objToread = new ObjectInputStream(fileToread);
        Object obj = objToread.readObject();
        objToread.close();
        return obj;
    }
 }