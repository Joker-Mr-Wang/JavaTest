package Java_210129;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public boolean threeConsecutiveOdds(int[] arr) {
        // ��������, �ҵ����п��ܴ��ڵ�����, ���жϾͿ�����.
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    // ������벻����ĿҪ��İ汾. �������������������ύ��ȥ, һ���Ǳ��벻�˵�~~
    public boolean threeConsecutiveOdds(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 2; i++) {
            if (arr.get(i) % 2 != 0 && arr.get(i+1) % 2 != 0 && arr.get(i+2) % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    // �������
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            // ֱ�ӷ���һ���յ� List
            return new ArrayList<>();
        }
        // result ������ʾ���ս��, ��� result �оͰ�����������
        List<List<Integer>> result = new ArrayList<>();
        // ����� 1 ��, ���ǹ̶���һ�� 1
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1) {
            // ����Ϊ 1 ��ʱ��, ���ؽ��:
            // [
            //   [1]
            // ]
            return result;
        }
        // ����� 2 ��, ���ǹ̶������� 1
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2) {
            return result;
        }
        // 3. ��������� i �е������
        //  a) ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ��, ���� 1
        //  b) ÿһ�е��������Ǻ�������ͬ
        //  c) i, j => i-1,j-1 + i-1,j
        for (int row = 3; row <= numRows; row++) {
            // ��ǰ���� row, ��һ�о��� row - 1.
            // �˴��� row �Ǵ� 1 ��ʼ�����. �� List �±��Ǵ� 0 ��ʼ���. ����Ҫ�� - 1
            // ������д�� row - 2
            List<Integer> prevLine = result.get(row - 1 - 1);
            List<Integer> currentLine = new ArrayList<>();
            currentLine.add(1); // ��һ��
            // �����м����Щ��
            for (int col = 2; col <= row - 1; col++) {
                // ���ѭ������Ҫ������һ�е�����
                // ��ȡ����һ�е�������ӦԪ��
                int num1 = prevLine.get(col - 1);  // ��ȡ�� row-1,col  ֻ������Ҫ�� col ת���±�, ����Ҫ -1
                int num2 = prevLine.get(col - 1 - 1); // ��ȡ�� row-1, col-1, Ҳ��Ҫ�� col ת���±�, ҲҪ�� - 1
                currentLine.add(num1 + num2);
            }
            currentLine.add(1); // ���һ��
            // �ѵ�ǰ��, �ŵ����յĽ����
            result.add(currentLine);
        }
        return result;
    }
}
