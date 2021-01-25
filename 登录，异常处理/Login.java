package Java_210125;

//自定义异常
//登录类
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name =scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        try{
            login(name,password);
        }catch (PasswordException e) {
            //先判断用户名是否异常
            e.printStackTrace();
            //在判断密码是否异常
        } catch (NameException e) {
            e.printStackTrace();
        }
    }

    private static void login(String name, String password) throws PasswordException, NameException {
        if (!name.equals("admin")){
         throw new NameException("用户名错误异常");
        }
        if(!password.equals("123456")){
            throw new PasswordException("密码错误异常");
        }
    }
}
