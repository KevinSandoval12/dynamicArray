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
}
