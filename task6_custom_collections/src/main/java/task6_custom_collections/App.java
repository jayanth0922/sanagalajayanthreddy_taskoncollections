package task6_custom_collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{private static final Logger log=LogManager.getLogger(App.class);
    public static void main(String[] args) 
    {
    	CustomList list = new CustomList();  
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("epam");
        list.add(2.5);
        log.info(list);
        list.remove(0);
        list.remove(list.size-1);
        log.info(list);
         
        log.info( list.get(0) );
        log.info( list.get(5) );
        list.add(10);
        log.info(list.get(3));
        list.remove(3);
        log.info(list.get(3));
        list.remove(7);
 
     
    }
}
 
