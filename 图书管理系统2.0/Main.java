package Java_210126;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.�����鼮��Ϣ
        BookList bookList = new BookList();
        //2.�����û���Ϣ
        User user = Login();
        //3.������ѭ��
        while(true){
            //����user���ĸ������ͣ����Ǿ�ʹ�ö�Ӧ����Ĳ˵�
            //���õ��Ƕ�̬��˼�룬������ͳһ��
           int choice= user.menu();
            //ѡ��ò˵�����Ӷ�Ӧ��ѡ��������Ӧ�����ӿڣ�
            user.doOperation(choice,bookList);
        }
    }

    private static User Login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������������");
        String name =scanner.next();
        System.out.println("������������ݣ�1����Ա��2��ͨ�û�");
        int who = scanner.nextInt();
        if (who==1){
            //ѡ��1�����ع���Ա��
            return new Admin(name);
        }
        else{
            //������ͨ��Ա��
            return new NormalUser(name);
        }
    }
}
