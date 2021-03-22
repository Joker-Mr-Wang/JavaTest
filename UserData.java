package loge;

public class UserData {
    public static  String[] userName=new String[10];//存放用户名的数组
    public static  String[] userPass=new String[10];//存放密码的数组

    static {
        userName[0]="zhangsan";
        userPass[0]="123456";
        userName[1]="magic";
        userPass[1]="123";
        userName[2]="wode";
        userPass[2]="1234";
    }

    //登陆的逻辑处理

    public  static boolean userLogin(String name,String pass){
        for (int i = 0 ;i<userName.length;i++){

            if (name.equals(userName[i])&&pass.equals(userPass[i])){
                return true;
            }
        }
        return false;
    }
}
