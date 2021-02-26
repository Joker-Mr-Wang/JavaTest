package Java_210125;
//除法异常
public class Test1 {
    public static void main(String[] args){
        //利用try，catch进行接收并处理异常
        try {
            int res = choose(10, 0);
            System.out.println(12);
        }
        catch (Exception e){
            e.printStackTrace();

        }
        //finally的语句一定会被执行，优先于try和catch
        finally {
            System.out.println(11);
        }
    }

    private static int choose(int i, int j) throws ArithmeticException {//抛出异常
        if (j==0){
            //如果被除数为0，throw自定义异常
            throw new ArithmeticException("算数异常");
        }
        return i/j;
    }
}
