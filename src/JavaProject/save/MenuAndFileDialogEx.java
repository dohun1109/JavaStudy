package JavaProject.save;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAndFileDialogEx extends JFrame {
    private JLabel img_Label = new JLabel();
    private JMenuBar mb = new JMenuBar();
    private JMenu fileMenu = new JMenu("File");
    private JMenuItem open_Item = new JMenuItem("Open");
    private JFileChooser chooser = new JFileChooser();
    private JTextArea ta = new JTextArea("AAA");


    MenuAndFileDialogEx(){
        this.setTitle("Menu 와 JFileChooser 활용 예제");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(350, 200);
        this.setVisible(true);
    }
    public void formDesign() {
        mb.add(fileMenu);
        fileMenu.add(open_Item);
        this.setJMenuBar(mb);
        this.add(img_Label);
    }
    public void eventHandler(){
        open_Item.addActionListener(new OpenActionListener());
        fileMenu.add(open_Item);
        mb.add(fileMenu);
//        setJMenuBar(mb);
        this.add(ta);
        
    }
    class OpenActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG&GIF Images","jpg","gif");

            chooser.setFileFilter(filter);

            int ret = chooser.showOpenDialog(null);
            if (ret != JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null,"파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
                return;
            }

            String filePath = chooser.getSelectedFile().getPath();
            img_Label.setIcon(new ImageIcon(filePath));
            pack();
        }
    }

    public static void main(String[] args) {
        new MenuAndFileDialogEx();
    }
}
