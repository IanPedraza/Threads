package cpp.pkg1;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/* HILOS */

public class CPP1 extends JFrame {
    
    private JButton btnRun, btnPause, btnStop;
    private JLabel lbThread1, lbThread2;
    private JTextArea taThread1, taThread2;
    private JScrollPane jsThread1, jsThread2;
    private Thread1 thread1;
    private Thread2 thread2;
    
    public static void main(String[] args) {
        CPP1 cpP1 = new CPP1();
        cpP1.setVisible(true);
        cpP1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public CPP1() {
        setSize(380, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Condiciones de Competencia");
        initCompnents();
    }    
    
    private void initCompnents() {
        btnRun = new JButton("Run");
        btnPause = new JButton("Pause");
        btnStop = new JButton("Stop");
        
        lbThread1 = new JLabel("Hilo 1");
        lbThread2 = new JLabel("Hilo 2");
        
        taThread1 = new JTextArea();
        taThread2 = new JTextArea();
        
        jsThread1 = new JScrollPane(taThread1);
        jsThread2 = new JScrollPane(taThread2);
        
        thread1 = new Thread1(taThread1);
        thread2 = new Thread2(taThread2);
        
        setLayout(null);
        
        btnRun.setBounds(10, 100, 100, 25);
        btnPause.setBounds(10, 150, 100, 25);
        btnStop.setBounds(10, 200, 100, 25);
        
        lbThread1.setBounds(150, 10, 100, 25);
        lbThread2.setBounds(250, 10, 100, 25);
        
        jsThread1.setBounds(150, 50, 100, 300);
        jsThread2.setBounds(250, 50, 100, 300);
        
        add(btnRun);
        add(btnPause);
        add(btnStop);
        add(lbThread1);
        add(lbThread2);
        add(jsThread1);
        add(jsThread2);
        
        btnRun.addActionListener((ActionEvent e) -> {
            thread1.start();
            thread2.start();
        });
        
        btnPause.addActionListener((ActionEvent e) -> {
            thread1.pause();
            thread2.pause();
        });
        
        btnStop.addActionListener((ActionEvent e) -> {
            thread1.pause();
            thread2.pause();
        });
    }
    
}
