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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public String remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
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
