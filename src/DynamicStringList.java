public class DynamicStringList implements StringList {

    private String[] list;
    private int listSize = 0;

    public DynamicStringList() {
        this.list = new String[4];
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
      if (listSize == list.length) {
        String[] newList = new String[list.length * 2];
        for (int i = 0; i < list.length; i++) {
          newList[i] = list[i];
        }
        newList[listSize] = value;
        this.list = newList;
      }

      // adds to end of list
      list[listSize++] = value;
    }

    @Override
    public String remove(int index) {
        String removed = list[index];
        while(index < listSize){
            list[index] = list[index+1];
            index++;
        }
        listSize--;
        return removed;
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
