package Java_210125;
//�����쳣
public class Test1 {
    public static void main(String[] args){
        //����try��catch���н��ղ������쳣
        try {
            int res = choose(10, 0);
            System.out.println(12);
        }
        catch (Exception e){
            e.printStackTrace();

        }
        //finally�����һ���ᱻִ�У�������try��catch
        finally {
            System.out.println(11);
        }
    }

    private static int choose(int i, int j) throws ArithmeticException {//�׳��쳣
        if (j==0){
            //���������Ϊ0��throw�Զ����쳣
            throw new ArithmeticException("�����쳣");
        }
        return i/j;
    }
}
