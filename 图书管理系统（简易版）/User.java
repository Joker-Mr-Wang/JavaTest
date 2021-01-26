package Java_210126;

import Java_210126.operation.IOperation;

//用户类
//此类不需要被实例化，我们更多的操作是在其子类上面
//我们将类进行抽象
public abstract class User {
    //用户的姓名
    //接口数组，是不可以实例化的，所以放到数组里面的内容就是实现接口的类的实例(一些功能方法)
    protected String name;
    protected IOperation[] operations;

    //打印菜单
    //因为用户不同所以菜单也不同，根据不同用户创建不同方法
    public abstract int menu();

    //选择对应的接口程序
    //需要两个变量：1选择序号，2选择的位置（书库是哪一个）
    //方法： 寻找对应的接口
    // this.operations[选择序号-1].work(书库是哪一个);
    public void doOperation(int choice,BookList bookList){
        this.operations[choice-1].work(bookList);
    }
}
