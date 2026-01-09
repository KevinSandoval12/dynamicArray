import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DynamicStringListTest {
  @Test
  public void DynamicStringList_Get(){
    DynamicStringList list = new DynamicStringList();
    list.add("1");
    list.add("2");

    String result = list.get(1);
    assertEquals("2", result);
  }

  @Test
  public void DynamicStringList_Get2(){
    DynamicStringList list = new DynamicStringList();
    list.add("1");
    list.add("2");

    String result = list.get(0);
    assertEquals("1", result);
  }

  @Test
  public void dynamicStringListTestMoreThan4Values(){
    DynamicStringList list = new DynamicStringList();
    list.add("0");
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");
    list.add("6");
    String actual1 = list.get(6);
    String actual2 = list.get(2);
    assertEquals("6", actual1);
    assertEquals("2", actual2);
  }
  

  @Test
  public void DynamicStringList_Set(){
    DynamicStringList list = new DynamicStringList();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");

    list.set(2, "momma");
    assertEquals(list.get(2), "momma");
  }

  @Test
  public void DynamicStringList_Remove(){
    DynamicStringList list = new DynamicStringList();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");

    String result = list.remove(0);
    assertEquals("1", result);
  }

  @Test
  public void testListSize(){
    DynamicStringList list = new DynamicStringList();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");

    assertEquals(list.size(), 4);
  }

  @Test
  public void testCapacity(){
    DynamicStringList list = new DynamicStringList();
    list.add("1");
    list.add("2");

    assertEquals(list.capacity(), 4);
  }

}
