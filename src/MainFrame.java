import javax.swing.*;
import java.awt.*;
public class MainFrame {
    JFrame newFrame = new JFrame("JAVA作业by Kulib");   //创建窗口
    JLayeredPane jlpane=newFrame.getLayeredPane();
    JButton Button=new JButton("SB JAVA"); //创建按钮
    ImageIcon bg=new ImageIcon("img/bj.jpg");
    JLabel label_bg=new JLabel();
    Container cont_bg=newFrame.getContentPane();    //try

    public void Init(){
        newFrame.setSize(1600,900);                                                                         //设置窗口分辨率为1600*900
        newFrame.setBounds(0,0,1600,900);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlpane.setLayout(null);

        bg.setImage(bg.getImage().getScaledInstance(1600, 900,Image.SCALE_DEFAULT ));                       //设置背景图片
        label_bg.setIcon(bg);
        label_bg.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
        cont_bg.add(label_bg);

        Button.setFont(new Font("黑体",Font.BOLD,10));
        Button.setBackground(Color.CYAN);
        Button.setBounds(10,10,80,30);
        jlpane.add(Button);

        newFrame.setVisible(true);  //显示窗口
    }
    void show_card(int card_num[]){
        for(int i=1;i<=13;i++) {
            ImageIcon pkImg = new ImageIcon(get_file(card_num[i]));
            JButton pkButton = new JButton(pkImg);
            pkButton.setBounds(150+80*i, 600, 134, 201);
            jlpane.add(pkButton);
        }

        for(int i=1;i<=13;i++) {
            ImageIcon pkImg = new ImageIcon(get_file(card_num[i+13]));
            JButton pkButton = new JButton(pkImg);
            pkButton.setBounds(150+80*i, 50, 134, 201);
            jlpane.add(pkButton);
        }
    }
    String get_file(int number){
        if(number==1)
            return "img/mei1.jpg";
        else if(number==2)
            return "img/mei2.jpg";
        else if(number==3)
            return "img/mei3.jpg";
        else if(number==4)
            return "img/mei4.jpg";
        else if(number==5)
            return "img/mei5.jpg";
        else if(number==6)
            return "img/mei6.jpg";
        else if(number==7)
            return "img/mei7.jpg";
        else if(number==8)
            return "img/mei8.jpg";
        else if(number==9)
            return "img/mei9.jpg";
        else if(number==10)
            return "img/mei10.jpg";
        else if(number==11)
            return "img/mei11.jpg";
        else if(number==12)
            return "img/mei12.jpg";
        else if(number==13)
            return "img/mei13.jpg";

        else if(number==14)
            return "img/hei1.jpg";
        else if(number==15)
            return "img/hei2.jpg";
        else if(number==16)
            return "img/hei3.jpg";
        else if(number==17)
            return "img/hei4.jpg";
        else if(number==18)
            return "img/hei5.jpg";
        else if(number==19)
            return "img/hei6.jpg";
        else if(number==20)
            return "img/hei7.jpg";
        else if(number==21)
            return "img/hei8.jpg";
        else if(number==22)
            return "img/hei9.jpg";
        else if(number==23)
            return "img/hei10.jpg";
        else if(number==24)
            return "img/hei11.jpg";
        else if(number==25)
            return "img/hei12.jpg";
        else if(number==26)
            return "img/hei13.jpg";

        else if(number==27)
            return "img/hong1.jpg";
        else if(number==28)
            return "img/hong2.jpg";
        else if(number==29)
            return "img/hong3.jpg";
        else if(number==30)
            return "img/hong4.jpg";
        else if(number==31)
            return "img/hong5.jpg";
        else if(number==32)
            return "img/hong6.jpg";
        else if(number==33)
            return "img/hong7.jpg";
        else if(number==34)
            return "img/hong8.jpg";
        else if(number==35)
            return "img/hong9.jpg";
        else if(number==36)
            return "img/hong10.jpg";
        else if(number==37)
            return "img/hong11.jpg";
        else if(number==38)
            return "img/hong12.jpg";
        else if(number==39)
            return "img/hong13.jpg";

        else if(number==40)
            return "img/fang1.jpg";
        else if(number==41)
            return "img/fang2.jpg";
        else if(number==42)
            return "img/fang3.jpg";
        else if(number==43)
            return "img/fang4.jpg";
        else if(number==44)
            return "img/fang5.jpg";
        else if(number==45)
            return "img/fang6.jpg";
        else if(number==46)
            return "img/fang7.jpg";
        else if(number==47)
            return "img/fang8.jpg";
        else if(number==48)
            return "img/fang9.jpg";
        else if(number==49)
            return "img/fang10.jpg";
        else if(number==50)
            return "img/fang11.jpg";
        else if(number==51)
            return "img/fang12.jpg";
        else if(number==52)
            return "img/fang13.jpg";

        else
            return "ERROR";
    }
}
