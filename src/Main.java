import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Main {
    public static int[] card_num;
    static void gen_ran(){
        card_num=new int[33];
        Random random = new Random();
        for(int i=1;i<=32;i++){
            card_num[i]=random.nextInt()%51;
            if(card_num[i]<0)
                card_num[i]*=-1;

            card_num[i]+=1;
        }
    }

    public static void main(String[] args){
        System.out.println("hello");
        MainFrame Frame=new MainFrame();
        Frame.Init();
        gen_ran();
        for(int i=1;i<=32;i++){
            System.out.print(card_num[i]);
            System.out.print(" ");
        }
        Frame.show_card(card_num);
    }
}