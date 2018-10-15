package demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Created by b5mali4 on 14.
 */
public class ReadObjectDemo1 implements Serializable{
    ObjectInputStream objectInputStream1;
    public ReadObjectDemo1(){

    }
    public void readObject(ObjectInputStream objectInputStream)throws java.io.IOException, ClassNotFoundException{
        System.out.println("readObject");
        objectInputStream.readUTF();
    }
    private void writeObject(java.io.ObjectOutputStream objectOutputStream)throws java.io.IOException{
        System.out.println("writeObject");

    }
    public void use(ObjectInputStream input) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(input);
        Object obj = (Object)ois.readObject();
        new ReadObjectDemo1().readObject(null);//use ReadObjectDemo1.readObject
    }
}
