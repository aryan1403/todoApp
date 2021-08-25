package com.todoapp.DB;

import java.util.Iterator;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import org.bson.Document;

public class db {
    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase database = mongoClient.getDatabase("tododb");
    MongoCollection<Document> collection = database.getCollection("todo");

    public void add(String key, String value) {
        collection.insertOne(new Document(key, value));
    }

    public String[] getAllTheDocuments() {
        Iterator it = collection.find().iterator();
        int counter = 0;
        String[] arr = new String[100];
        while(it.hasNext()) {
            Document doc = (Document) it.next();
            String s = doc.getString("todo");
            arr[counter] = s;
            counter++;
        }
        return arr;
    }

    public void delete(String value){
        collection.deleteOne(Filters.eq("todo", value));
    }
}
