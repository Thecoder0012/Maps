import java.util.Map;

public class Maps {

    private final Map<String, Integer> map;

    public Maps(Map<String, Integer> map) {
        this.map = map;
    }

    public void AddToMap(String name, int number) {
        map.put(name, number);
    }

    public void viewMap(String a) {
        map.containsKey(a);
    }

    public Integer getMap(String getMap) {
        return map.get(getMap);
    }

    @Override
    public String toString() {
        return "Phonebook" +
                map;
    }
}
