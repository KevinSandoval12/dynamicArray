public class DynamicStringList implements StringList {

    private String[] list;
    private int listSize = 1;

    public DynamicStringList() {
        list = new String[4];
    }

    public DynamicStringList(int limit) {
        list = new String[limit];
    }

    @Override
    public String get(int index) {
      return list[index];
    }

    @Override
    public void set(int index, String value) {
      list[index] = value;
    }

    @Override
    public void add(String value) {
      // edge case to check if we need to make a new list
      if (listSize == capacity()) {
        String[] newList = new String[list.length * 2];
        for (int i = 0; i < list.length; i++) {
          newList[i] = list[i];
        }
        listSize++;
        newList[listSize] = value;
      }

      // adds to end of list
      list[listSize] = value;
    }

    @Override
    public String remove(int index) {

    }

    @Override
    public int size() {
        return listSize;
    }

    @Override
    public int capacity() {
        return list.length;
    }
    
}
