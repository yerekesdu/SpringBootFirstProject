package kz.springboot.springbootdemo.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Items> items = new ArrayList<>();

    static {
        items.add(new Items(1L, "Iphone 11 PRO", 1000));
        items.add(new Items(2l, "XIAOMI Redmi Note 9", 1200));
        items.add(new Items(3L, "Samsung Xalaxy 10S", 1100));
        items.add(new Items(4l, "Nokie 3310", 700));
    }

    private static Long id = 5L;

    public static ArrayList<Items> getItems(){
        return items;
    }

    public static void addItem(Items item){
        item.setId(id);
        items.add(item);
        id++;
    }

    public static Items getItem(Long id){
        for(Items it: items){
            if(it.getId()==id)
                return it;
        }
        return null;
    }

}
