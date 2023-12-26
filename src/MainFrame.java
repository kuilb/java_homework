import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainFrame {
    JFrame newFrame = new JFrame("JAVA作业by Kulib");   //创建窗口
    JLayeredPane jlpane=newFrame.getLayeredPane();
    JButton Button=new JButton("重开");
    ImageIcon bg=new ImageIcon("img/bj.jpg");
    JLabel label_bg=new JLabel();
    Container cont_bg=newFrame.getContentPane();    //try
    public static JButton[] your_pkcards=new JButton[14];
    public static JButton[] rival_pkcards=new JButton[14];
    static btnListener[] pk_cards_listener=new btnListener[14];
    get_file g=new get_file();
    public static int[] card_num;
    public static int your_temp=0;
    public static int rival_temp=0;
    public void Init(){
        newFrame.setSize(1600,900);                                                                         //设置窗口分辨率为1600*900
        newFrame.setBounds(0,0,1600,900);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlpane.setLayout(null);

        bg.setImage(bg.getImage().getScaledInstance(1600, 900,Image.SCALE_DEFAULT ));                       //设置背景图片
        label_bg.setIcon(bg);
        label_bg.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
        cont_bg.add(label_bg);

        Button.setFont(new Font("黑体",Font.BOLD,30));
        Button.setBackground(Color.CYAN);
        Button.setBounds(10,10,100,40);
        jlpane.add(Button);

        newFrame.setVisible(true);  //显示窗口
    }
    void show_card(int card_num[]){
        for(int i=1;i<=13;i++) {
            String num=""+i;
            JButton your_pkcard=new JButton(num);
            your_pkcards[i]=your_pkcard;

            ImageIcon pkImg = new ImageIcon(g.get_file(card_num[i]));
            your_pkcards[i].setIcon(pkImg);
            your_pkcards[i].setBounds(150+80*i, 600, 134, 201);
            jlpane.add(your_pkcards[i]);
        }

        for(int i=1;i<=13;i++) {
            JButton rival_pkcard=new JButton();
            rival_pkcards[i]=rival_pkcard;

            ImageIcon pkImg = new ImageIcon(g.get_file(card_num[i+13]));
            rival_pkcards[i].setIcon(pkImg);
            rival_pkcards[i].setBounds(150+80*i, 50, 134, 201);
            jlpane.add(rival_pkcards[i]);
        }
    }
    void Init_listener(){
        for(int i=1;i<=13;i++){
            btnListener pk_card_listener=new btnListener();
            pk_cards_listener[i]=pk_card_listener;
            your_pkcards[i].addActionListener(pk_cards_listener[i]);
        }
        reset_button restart=new reset_button();
        Button.addActionListener(restart);
    }
    public static void copy_num(int[] source_num){
        card_num=new int[33];
        for(int i=1;i<=32;i++){
            card_num[i]=source_num[i];
        }
    }
    void play(int your_num,int rival_num){
        your_pkcards[your_num].setBounds(500, 300, 134, 201);
        rival_pkcards[rival_num-13].setBounds(1000, 300, 134, 201);
        your_temp=your_num;
        rival_temp=rival_num;
    }
    void clear_card(){
        if(your_temp!=0 && rival_temp!=0){
            your_pkcards[your_temp].setVisible(false);
            rival_pkcards[rival_temp-13].setVisible(false);
        }
    }
    public void reset(){
        your_temp=0;
        rival_temp=0;
        for(int i=1;i<=13;i++) {
            ImageIcon pkImg = new ImageIcon(g.get_file(card_num[i]));
            your_pkcards[i].setIcon(pkImg);
            your_pkcards[i].setBounds(150+80*i, 600, 134, 201);
            your_pkcards[i].setVisible(true);
        }
        for(int i=1;i<=13;i++) {
            ImageIcon pkImg = new ImageIcon(g.get_file(card_num[i+13]));
            rival_pkcards[i].setIcon(pkImg);
            rival_pkcards[i].setBounds(150+80*i, 50, 134, 201);
            rival_pkcards[i].setVisible(true);
        }
    }
    public void reset_req(){
        int op = JOptionPane.showConfirmDialog(null,"再来一把?", "提示",JOptionPane.YES_NO_CANCEL_OPTION);
        if(op==JOptionPane.YES_OPTION){
            btnListener reset=new btnListener();
            reset.reset_counter();
            Main.new_game();
        }
        else if(op==JOptionPane.NO_OPTION){
            return;
        }
    }
}
