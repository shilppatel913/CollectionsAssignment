package com.collectionsassignment.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

public class SerDeserHashMap {

	public static void main(String[] args) throws ClassNotFoundException {
		HashMap<Integer,String> id_name=new HashMap<>();
		
		id_name.put(1,"Nishita");
		id_name.put(2, "Niraj");
		id_name.put(3,"Shilp");
		
		/*Serializing the map object */
		try {
			OutputStream file=new FileOutputStream("data.ser");
			ObjectOutputStream obj=new ObjectOutputStream(file);
			obj.writeObject(id_name);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		/*Deserialize the map object from the data file */
		
		try {
			InputStream fileInput=new FileInputStream("data.ser");
			ObjectInputStream in=new ObjectInputStream(fileInput);
			HashMap<Integer,String> temp=(HashMap<Integer, String>) in.readObject();
			temp.forEach((key,value)->System.out.println(key+" "+value));
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
