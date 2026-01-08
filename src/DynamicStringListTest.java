import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DynamicStringListTest {
  @Test
  public void DynamicStringList_Get(){
    DynamicStringList list = new DynamicStringList();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");


    String result = list.get(0);
    assertEquals("1", result);
  }
}
