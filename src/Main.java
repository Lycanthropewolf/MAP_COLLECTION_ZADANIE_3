public class Main {
    public static void main(String[] args) {
        MAP_COLLECTION.map.put("str1",4);
        MAP_COLLECTION.map.put("str2",3);
        MAP_COLLECTION.map.put("str3",8);
        MAP_COLLECTION.map.put("str4",1);
        MAP_COLLECTION.map.put("str5",9);
        MAP_COLLECTION.map.put("str6",2);
        System.out.println(MAP_COLLECTION.map);
        MAP_COLLECTION.addToMap("str5",4);
        System.out.println(MAP_COLLECTION.map);

    }
}