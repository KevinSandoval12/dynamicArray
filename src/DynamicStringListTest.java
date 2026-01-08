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
  
}
