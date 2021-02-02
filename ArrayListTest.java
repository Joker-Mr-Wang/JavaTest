package Java_210202;


import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> arrayList =new ArrayList<>();
        //size是输出顺序表的长度
        System.out.println(arrayList.size());
        //isEmpty是判断是否为空
        System.out.println(arrayList.isEmpty());
        //2.往ArrayList里面添加元素,add（字符）插入到顺序表的尾部
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("c");
        System.out.println(arrayList.isEmpty());
        System.out.println("第一次输出"+arrayList);
        //add(位置，内容)在指定位置上插入(从0开始的)
        arrayList.add(2,"javaScript");
        System.out.println("第二次输出"+arrayList);
        //3删除remove(位置)
//        arrayList.remove(2);
//        System.out.println("按位置删除后"+arrayList);
//
//        arrayList.remove("c");
//        //若存在重复元素，删除前面的元素
//        System.out.println("按值删除"+arrayList);

        //4查找
        boolean ret =arrayList.contains("c");
        System.out.println("查找c的结果是："+ret);
        int index =arrayList.indexOf("c");
        System.out.println("查找c的位置"+index);

        //5获取元素、修改元素
        //获取0号元素的信息
        String elem =arrayList.get(0);
        //修改0号元素
        arrayList.set(0,"go");
        System.out.println(arrayList);

        //遍历数组
        //1.利用下标来遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
        //2
    }


}
