import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btnListener implements ActionListener {
    public static int[] card_num;
    static public int counter=0;
    get_file g=new get_file();
    MainFrame m=new MainFrame();
    public static void copy_num(int[] source_num){
        card_num=new int[33];
        for(int i=1;i<=32;i++){
            card_num[i]=source_num[i];
        }
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("button has been clicked");

        String button_name=event.getActionCommand();
        int num=Integer.parseInt(button_name);
        System.out.println(num);
        System.out.println(g.get_file(card_num[num]));
        int card_temp=0;
        int card_min=100;
        int r_num=1;
        for(int i=14;i<=26;i++){
            if(card_num[i]!=100 && card_num[num]!=100) {
                card_temp = Math.abs(card_num[i] - card_num[num]);
                if (card_min > card_temp) {
                    card_min = card_temp;
                    r_num = i;
                }
            }
        }
        System.out.println(r_num);
        System.out.println(g.get_file(card_num[r_num]));
        m.clear_card();
        m.play(num,r_num);
        card_num[num]=100;
        card_num[r_num]=100;
        counter++;
        if(counter==13){
            m.reset_req();
        }
    }
    public void reset_counter(){
        counter=0;
    }
}
