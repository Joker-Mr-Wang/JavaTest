package Java_210126;

import Java_210126.operation.IOperation;

//�û���
//���಻��Ҫ��ʵ���������Ǹ���Ĳ�����������������
//���ǽ�����г���
public abstract class User {
    //�û�������
    //�ӿ����飬�ǲ�����ʵ�����ģ����Էŵ�������������ݾ���ʵ�ֽӿڵ����ʵ��(һЩ���ܷ���)
    protected String name;
    protected IOperation[] operations;

    //��ӡ�˵�
    //��Ϊ�û���ͬ���Բ˵�Ҳ��ͬ�����ݲ�ͬ�û�������ͬ����
    public abstract int menu();

    //ѡ���Ӧ�Ľӿڳ���
    //��Ҫ����������1ѡ����ţ�2ѡ���λ�ã��������һ����
    //������ Ѱ�Ҷ�Ӧ�Ľӿ�
    // this.operations[ѡ�����-1].work(�������һ��);
    public void doOperation(int choice,BookList bookList){
        this.operations[choice-1].work(bookList);
    }
}
