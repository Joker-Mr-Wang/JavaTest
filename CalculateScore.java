package Java_201213;
//����1/1-1/2+1/3-1/4+1/5 ���� + 1/99 - 1/100 ��ֵ ��
public class CalculateScore {
    public static void main(String[] args){
        double res=0;
        for (int i = 1; i <=100; i+=2) {
            double  tmp=Calculate(i,i+1);//����Ϊһ��
            res+=tmp;
        }
        System.out.println(res);
    }

    private static double Calculate(int i,int j) {
        return (1.0/i-1.0/j);
    }
}
