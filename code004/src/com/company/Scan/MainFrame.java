package com.company.Scan;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(String sTitle , int iWidth , int iHeight){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//获取屏幕尺寸
        ImageIcon li = new ImageIcon("Imange/middle.gif");
        setTitle(sTitle);//设置窗体
        setIconImage(li.getImage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(iWidth , iHeight);
        int w = getSize().width;
        int h = getSize().height;
        System.out.println("窗体宽" +w + "窗体高" + h);
        int x =(dim.width - w )/2 ;
        int y = (dim.height - h )/2;
        setLocation(x,y);
        setVisible(true);

    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        MainFrame mF = new MainFrame("mian Frame Demo " , 400 , 300);
    }


}
