package start.list;

import java.util.*;

/**
 * @author: lrk
 * 2019/4/7 17:36
 */
public class Demo2 {
    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        for(int i =0; i <list.size();i++){
            System.out.println(list.get(i)+"---");


        }

        System.out.println("-------迭代器遍历--------");
        HashSet<String> set =new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+"---");
        }
        System.out.println("------for循环----------");
        for(String str :set){
            System.out.println(str+"---");

        }

        System.out.println("------entrySet方法----------");
        HashMap<String,String> map =new HashMap<>();
        map.put("aaa","111");
        map.put("bbb","222");
        map.put("ccc","333");
        Set<Map.Entry<String,String>> Eset = map.entrySet();
        for(Map.Entry<String,String> entry:Eset){
            System.out.println(entry.getKey()+"---"+entry.getValue());

        }
    }

}
