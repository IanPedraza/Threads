package cpp.pkg1;

import javax.swing.JTextArea;

public class Thread2 extends Thread {
    
    private JTextArea textArea;
    private Boolean isRunning = true;
    
    public Thread2(JTextArea textArea) {
        this.textArea = textArea;
    }
    
    @Override
    public void run() {
         int i = 0;
        
        while (isRunning) {
            textArea.append(i + "\n");
            i++;
        }
    }
    
    public Boolean isRunning() {
        return isRunning;
    }

    public void pause() {
        this.isRunning = false;
    }
    
}
