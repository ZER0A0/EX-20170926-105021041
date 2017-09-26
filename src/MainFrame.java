import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    public MainFrame() {
        initComp(); }
    private Button btnExit = new Button("Exit");
    private Button btnA = new Button("++");
    private Button btnB = new Button("--");
    private Label La = new Label("OAO");
    private int count = 0;
    private void initComp() {
        this.setBounds(100, 120, 400, 300);
        this.setLayout(null);
        btnExit.setBounds(150, 185, 100, 30);
        btnA.setBounds(25, 185, 100, 30);
        btnB.setBounds(275, 185, 100, 30);
        La.setBounds(50,100,100,30);
        this.add(btnExit);
        this.add(btnA);
        this.add(btnB);
        this.add(La);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(count++));
            }
        });
        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(count--));
            }
        });

    }
}