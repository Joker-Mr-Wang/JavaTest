package Java_210202;


import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> arrayList =new ArrayList<>();
        //size�����˳���ĳ���
        System.out.println(arrayList.size());
        //isEmpty���ж��Ƿ�Ϊ��
        System.out.println(arrayList.isEmpty());
        //2.��ArrayList�������Ԫ��,add���ַ������뵽˳����β��
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("c");
        System.out.println(arrayList.isEmpty());
        System.out.println("��һ�����"+arrayList);
        //add(λ�ã�����)��ָ��λ���ϲ���(��0��ʼ��)
        arrayList.add(2,"javaScript");
        System.out.println("�ڶ������"+arrayList);
        //3ɾ��remove(λ��)
//        arrayList.remove(2);
//        System.out.println("��λ��ɾ����"+arrayList);
//
//        arrayList.remove("c");
//        //�������ظ�Ԫ�أ�ɾ��ǰ���Ԫ��
//        System.out.println("��ֵɾ��"+arrayList);

        //4����
        boolean ret =arrayList.contains("c");
        System.out.println("����c�Ľ���ǣ�"+ret);
        int index =arrayList.indexOf("c");
        System.out.println("����c��λ��"+index);

        //5��ȡԪ�ء��޸�Ԫ��
        //��ȡ0��Ԫ�ص���Ϣ
        String elem =arrayList.get(0);
        //�޸�0��Ԫ��
        arrayList.set(0,"go");
        System.out.println(arrayList);

        //��������
        //1.�����±�������
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
        //2
    }


}
