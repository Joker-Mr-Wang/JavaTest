package Java_210126;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.创建书籍信息
        BookList bookList = new BookList();
        //2.创建用户信息
        User user = Login();
        //3.进入主循环
        while(true){
            //看看user是哪个子类型，我们就使用对应子类的菜单
            //采用的是多态的思想，将类型统一化
           int choice= user.menu();
            //选择好菜单后添加对应的选择结果（对应方法接口）
            user.doOperation(choice,bookList);
        }
    }

    private static User Login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名");
        String name =scanner.next();
        System.out.println("请输入您的身份：1管理员，2普通用户");
        int who = scanner.nextInt();
        if (who==1){
            //选择1，返回管理员类
            return new Admin(name);
        }
        else{
            //返回普通成员类
            return new NormalUser(name);
        }
    }
}
