package Java_210201;

 class MyArrayListIndexOutOfRangeException extends RuntimeException {
    public MyArrayListIndexOutOfRangeException(String s) {
        super(s);
    }
}
public class MyArrayList {
    //属性
     private String[] data = null;
    //当前顺序表中的元素
    private int size = 0;
    //当前顺序表最大容纳数量
    private int capacity =100;
    //如果size>capacity后就需要扩容
    public MyArrayList(){
        //初始化data数组,否则后续会出现空指针异常
        data = new String[capacity];
    }


    //方法.增删改查

    //实现扩容
    public void realloc(){
        //先把capacity变大(这里先扩大两倍)
        capacity*=2;
        String[] newData =new String[capacity];
        //把旧的数组中数据放入新数组中
        for (int i = 0; i <data.length; i++) {
            newData[i]=data[i];
        }
        //将新的newdata数组给到原有属性data从而实现扩容;
        data=newData;
    }
    //1.把元素尾插到顺序表末尾,时间复杂度0(1);
    public void add(String elem){
        if (size>=capacity){
            //需要先扩容在赋值
            //扩容的时间复杂度是O(N),但是扩容是一个低概率事件
           realloc();
        }
        //吧新元素放置到下标为size的位置上去
       data[size]= elem;
        size++;
    }

    //2.把元素插入任意中间位置
    public void add(int index,String elem) {
        //index需在范围内才可以进行操作
        if (index<0||index>size){
            return;
        }
        if (size >= capacity) {
            //需要先扩容在赋值
            realloc();
        }
        //吧elem放入index位置,
        //将index的元素以此向后搬运,从而给index腾出一个空闲位置
        for (int i = size-1; i >=index ; i--) {
            data[i+1]=data[i];
        }
        //将elem放入数组中
        data[index]=elem;
        //整体长度+1;
        size++;
    }

    //3.按照下标位置删除元素
    public String remove(int index){
        //仍需要搬运,把需要删除的元素覆盖掉即可.
      if (index<0||index>=size){
          return null;
      }
      String result =data[index];
      for (int i=index;i<size-1;i++){
          data[i]=data[i+1];
      }
        size--;
      return result;
    }
    //4.按照元素的值来删除元素,这个方法来判断是否删除成功
    public boolean remove (String elem){
              int index =0;
              for (;index<size;index++){
                  if (data[index].equals(elem)){
                      break;
                  }
              }
              //没找到
              if (index>=size){
                  return  false;
              }
              //找到了
        for (int i = index; i <size-1 ; i++) {
            data[i]=data[i+1];
        }
        size--;
        return true;
    }

    //5.根据下标获取元素
    public String get(int index){
            if (index<0||index>=size){
             throw new MyArrayListIndexOutOfRangeException("下标越界了!index:"+index);
            }

        return data[index];
    }
    //6根据下标修改元素
    public String set(int index,String elem){
        if (index<0||index>=size){
            return null;
        }
        data[index]=elem;
        return data[index];
    }

    //7.判断元素是否存在
    public boolean contains(String elem){
        for (int index = 0; index <size ; index++) {
            if (data[index].equals(elem)){
                return true;
            }
        }
        return false;
    }

    //8.查找元素位置
    public int indexOf(String elem){
        int index = 0;
        for (; index <size ; index++) {
            if (data[index].equals(elem)){
                return index;
            }
        }
       return -1;
    }

    //9.查找元素位置(从后往前找)
    public int listIndexOf(String elem){

        for ( int index = size-1; index >=0 ; index++) {
            if (data[index].equals(elem)){
                return index;
            }
        }
        return -1;
    }

    //10.清空操作
    public void clear(){
        size=0;
    }

    //11.求长度
    public int size(){
        return size;
    }

    //12判空
    public boolean isEmpty(){
        return size==0;
    }
    @Override
      public String toString(){
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("[");
        for (int i=0;i<size;i++){
            stringBuilder.append(data[i]);
            if (i<size-1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
    public static void addTest(){
        MyArrayList myArrayList =new MyArrayList();
        myArrayList.add("c");
        myArrayList.add("c++");
        myArrayList.add("java");
        myArrayList.add("python");
        //1验证尾插
        //这样输出只会输出一个object类的tostring,(类型+hascode),所以需要重写toString方法
        System.out.println(myArrayList);
        System.out.println("----------------------------");
        //2验证按位置插入.
        myArrayList.add(2,"go");
        System.out.println(myArrayList);
        System.out.println("----------------------------");
    }
    public static void removeTest(){
        MyArrayList myArrayList =new MyArrayList();
        myArrayList.add("c");
        myArrayList.add("c++");
        myArrayList.add("java");
        myArrayList.add("python");
        //3验证删除操作
        myArrayList.remove(2);
        System.out.println(myArrayList);
        System.out.println("----------    -------------");
        //4验证删除及是否成功
        System.out.println(myArrayList.remove("c"));
        System.out.println(   myArrayList.remove("j"));
        System.out.println(myArrayList);
        System.out.println("----------------------------");
    }
    public static void getSetTest(){
        MyArrayList myArrayList =new MyArrayList();
        myArrayList.add("c");
        myArrayList.add("c++");
        myArrayList.add("java");
        myArrayList.add("python");
        //5.验证get方法
        String getString=myArrayList.get(1);
        System.out.println(getString);
        //6.验证set方法
        String setString=myArrayList.set(2,"JavaScript");
        System.out.println(setString);
        System.out.println(myArrayList);
    }

    public static void containsTest(){
        MyArrayList myArrayList =new MyArrayList();
        myArrayList.add("c");
        myArrayList.add("c++");
        myArrayList.add("java");
        myArrayList.add("python");
        //7.判断元素是否存在
        myArrayList.contains("c");
        //8判断元素位置
        myArrayList.indexOf("c++");
        //9判断元素位置(从后往前)
        myArrayList.listIndexOf("c++");
    }

    public static void sizeTest(){
        MyArrayList myArrayList =new MyArrayList();
        myArrayList.add("c");
        myArrayList.add("c++");
        myArrayList.add("java");
        myArrayList.add("python");
        //9.求长度
        System.out.println( myArrayList.size());
        //10判空
        System.out.println(myArrayList.isEmpty());
        //11清空
        myArrayList.clear();
        System.out.println( myArrayList.size());
        System.out.println(myArrayList.isEmpty());


    }
    //main
    public static void main(String[] args) {
        //TODO
       //addTest();
       //removeTest();
       //getSetTest();
       // containsTest();
        sizeTest();
    }
}
