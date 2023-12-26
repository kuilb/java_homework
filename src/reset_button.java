import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class reset_button implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event) {
        btnListener reset=new btnListener();
        reset.reset_counter();
        Main.new_game();
    }
}
