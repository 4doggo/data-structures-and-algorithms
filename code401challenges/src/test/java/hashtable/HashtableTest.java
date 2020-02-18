package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HashtableTest {

//    @Test
//    public void testGet(){
//
//        Hashtable.Map<String, Integer> map = new Hashtable.Map<>();
//        map.add("a",1);
//
//        assertThat("a","1",map.get("a"));
//
//    }

    @Test
    public void testRemoveAndAdd(){

        Hashtable.Map<String, Integer> map = new Hashtable.Map<>();
        map.add("a",1);
        map.add("b",2);
        map.remove("b");

        assertFalse("removed b", map.contains("b"));

    }

    @Test
    public void testContains(){

        Hashtable.Map<String, Integer> map = new Hashtable.Map<>();
        map.add("a",1);

        assertTrue("testing contains", map.contains("a"));
        assertFalse("testing contains", map.contains("b"));
    }



}