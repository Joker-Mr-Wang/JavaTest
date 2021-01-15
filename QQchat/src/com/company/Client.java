package com.company;


import javax.swing.*;

import java.awt.event.*;
import java.io.*;

import java.net.Socket;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    //窗体
    private JFrame frame;
    //带滚动条的面板
    private JScrollPane scrollPane;
    //文本框
    private JTextArea textArea;
    //操作面板
    private JPanel jPane1;
    //输入框
    private JTextField textField;
    //按钮
    private JButton button;

    //流
    private PrintWriter out;
    //格式化时间对象
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-uu-dd hh:mm:ss");
    String time = null;

    //构造方法 1没有返回值 2和类名一致 类在实例化的时候i就会调用构造方法
    public Client() {


        //调用画图的方法
        init();

    }

    //组装零件
    public void init() {
        frame = new JFrame();//创建窗体
        frame.setTitle("QQ-冷極                           客户端");//窗体名称
        frame.setBounds(750, 150, 450, 650);//窗体位置尺寸
        /*文本框组装*/
        textArea = new JTextArea();//创建文本框
        scrollPane = new JScrollPane(textArea);//创建拖动条并将文本框放进拖动条中
        frame.add(scrollPane, "Center");//  将拖动条面板添加到窗体中间
        /*操作面板的组装*/
        jPane1 = new JPanel();//创建操作面板
        textField = new JTextField(28);//创建输入框
        button = new JButton("发送");//创建按钮
        jPane1.add(textField);//将输入框加到操作面板
        jPane1.add(button);//将按钮加到操作面板
        frame.add(jPane1, "South");//将操作面板添加到窗体下方
        frame.setVisible(true);//窗口显示
        myEvent();
        socket();

    }

    //程序的入口
    public static void main(String[] args) {
        //实例化 类名 对象名 = new 构造方法；
        Client cc = new Client();
    }

    /*建立监听*/
    public void myEvent() {
        frame.addWindowListener(new WindowAdapter() {//建立窗口监听
            @Override
            public void windowClosing(WindowEvent e) {//点击x则监听
                System.exit(0);//退出Java虚拟机
            }
        });

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                addtext();
            }
        });
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()=='\n'){//判断    你按下的是回车键
                    addtext();
                }
            }
        });
    }

    public void addtext() {
        /*发送消息*/
        String text = textField.getText();//得到文本
        time = sdf.format(new Date());//建立时间
        if (text != null) ;//判断消息内容
        textArea.append(time + "我说：" + text + "\n");
         //发送消息给对方
        out.println(text);

        textField.setText("");//清空输入框
    }


    /*建立通信的方法  Socket*/
    public void socket() {
        //流
        try {
            //提供服务端的 IP 端口号
            Socket socket = new Socket("localhost", 10009);
//利用 socket 得到 字节输入流
            InputStream inputStream = socket.getInputStream();
//利用 imputStream 得到一个字符输入流
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//利用inpuStreamReader 等到一个缓冲流，起到加强inpuStreamReader的作用
            BufferedReader br = new BufferedReader(inputStreamReader);
            out = new PrintWriter(socket.getOutputStream(), true);//创建发送消息流
            while (true) {
                String data = br.readLine();
                time = sdf.format(new Date());
                textArea.append(time + "孤酒暖阳说：" + data +"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


