package Java_210125;

//�Զ����쳣
//��¼��
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������û�����");
        String name =scanner.next();
        System.out.println("����������");
        String password = scanner.next();
        try{
            login(name,password);
        }catch (PasswordException e) {
            //���ж��û����Ƿ��쳣
            e.printStackTrace();
            //���ж������Ƿ��쳣
        } catch (NameException e) {
            e.printStackTrace();
        }
    }

    private static void login(String name, String password) throws PasswordException, NameException {
        if (!name.equals("admin")){
         throw new NameException("�û��������쳣");
        }
        if(!password.equals("123456")){
            throw new PasswordException("��������쳣");
        }
    }
}
