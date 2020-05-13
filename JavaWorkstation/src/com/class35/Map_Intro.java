package com.class35;

public class Map_Intro {

/* Map Interface (not part of collection framework)
 * 
 * - Storing Keys and Values
 * 	= Objects
 * 
 * - Storing in double objects (not single)
 * 	Example:
 *  HashMap<key, Value>
 * 
 * Combination of 'key' and 'value' = entry
 * 
 * Map 
 * - is a collection of entries
 * - Interface that is not a part of Collection framework
 * - Will have its own unique methods to manipulate 
 * 	 with data
 * - Inside the Map we store 2 objects as key+value-->entry
 * - Map is a collection of Entry Objects
 * 
 * Classes that implement Map interface:
 * - HashMap = Map in which order is not maintained
 * - TreeMap = Map in which key objects will be stored in ascending order
 * - LinkedHashMap = Map in which order of the objects will be maintained/preserved
 * - HashTable 
 * 
 * In automation:
 * - We will read excel files = Rows and Columns
 * - We will read Database tables example= ID# and Value
 * 
 * NOTE:
 *  - copy methods from slide
 *  
 *  
 *  to store objects --> .put(k , v)
 *  to retrieve --> .get(k); 
 *  
 *  To retrieve all keys
 *  keySet(); --> returns a set of all keys from the map
 *  			(keys are always unique)
 *  
 *  To retrieve all values
 *  .values(); --> returns a Collection of values
 *  			(values can be duplicates and they are not ordered);
 * 
  							METHODS IN MAP INTERFACE
public Object put(Object key, Object value): This method is used to insert an entry in this map.
public void putAll(Map map): This method is used to insert the specified map in this map.
public Object remove(Object key): This method is used to delete an entry for the specified key.
public Object get(Object key):This method is used to return the value for the specified key.
public boolean containsKey(Object key): This method is used to search the specified key from this map.
public Set keySet(): This method is used to return the Set view containing all the keys.
public Set entrySet(): This method is used to return the Set view containing all the keys and values.
 *  
 *  
 *  
 *  
 *  
 * 	
 */

}
