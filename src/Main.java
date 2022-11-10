public class Main {
    public static void main(String[] args) {
        MapCollection.map.put("str1",4);
        MapCollection.map.put("str2",3);
        MapCollection.map.put("str3",8);
        MapCollection.map.put("str4",1);
        MapCollection.map.put("str5",9);
        MapCollection.map.put("str6",2);
        System.out.println(MapCollection.map);
        MapCollection.addToMap("str5",4);
        System.out.println(MapCollection.map);

    }
}