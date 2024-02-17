package HashTables;
import java.util.*;

public class HashTables {

    public static void main(String[] args) {
        
        Hashtable<String, String> table = new Hashtable<>(10);

        //.put method is used to add elements to the table
        table.put("100", "Spongebob");
        table.put("202", "Patrick");
        table.put("303", "Squidward");
        table.put("404", "Mr. Krabs");
        table.put("505", "Plankton");
        table.put("606", "Sandy");
        table.put("753", "Gary");
        table.put("884", "Pearl");
        table.put("999", "Mrs. Puff");
        table.put("1301", "Larry");
        

        //Remove
        //table.remove(1000); //Removes Larry from the table

        for(String key : table.keySet()){
            System.out.println(key.hashCode() % 10 +"\t"+key+"\t" + table.get(key));
        }

    }
    
}
