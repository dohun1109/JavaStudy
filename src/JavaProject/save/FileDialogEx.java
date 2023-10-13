package JavaProject.save;

import com.sun.jdi.ArrayReference;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class FileDialogEx extends JFrame implements ActionListener {

    private JMenuBar mb = new JMenuBar();
    private JMenu fileMenu = new JMenu("FILE");
    private JMenuItem openItem = new JMenuItem("Open");
    private JMenuItem saveItem = new JMenuItem("Save");
    private JMenuItem loadItem = new JMenuItem("Load");

    private JLabel img_label = new JLabel("AAA");
    private JFileChooser fc = new JFileChooser();
    private JTextArea ta = new JTextArea("AAA");



    

    FileDialogEx() throws IOException {
        this.setTitle("파일 다이얼 로그");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void formDesign() {
        mb.add(fileMenu);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(loadItem);
        this.setJMenuBar(mb);

//        this.add(img_label);

        this.add(ta);


    }

    public void eventHandler() {
        // 이벤트 소스 찾기, 귀를 달아주고, Listener 구현.

        openItem.addActionListener(this);

        saveItem.addActionListener(this);

        loadItem.addActionListener(this);

    }

    public static void main(String[] args) throws Exception{
        new FileDialogEx();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Open")) {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG&GIF", "jpg", "gif");

            fc.setFileFilter(filter);

            int ret = fc.showOpenDialog(null);
            if (ret != JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
                return;
            }
            //사용자가 파일을 서택하고 "열기",버튼 누른 경우
            //파일 다이얼 로그가 실제 파일을 열기까지 수정하는 것이 아니라 , 다이얼로그는 사용자로부터 파일 이름을 얻어낸는 목적에 국한된다.
            
            String filePath = fc.getSelectedFile().getAbsolutePath();
            img_label.setIcon(new ImageIcon(filePath));
            pack();

        } else if (e.getActionCommand().equals("Save")) {
            //파일 저장하기 기능 구현
            FileNameExtensionFilter filter2 = new FileNameExtensionFilter("TXT", "txt");
            fc.setFileFilter(filter2);

//            fc.setCurrentDirectory(new File("/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/save/save.txt"));
            
            int ret = fc.showSaveDialog(null);
            if (ret != JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(null, "파일을 선택안함.", "경고", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String FilePath = fc.getSelectedFile().getAbsolutePath();
//            String FilePath = "/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/save/save.txt";
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter(FilePath));
                String txt = ta.getText();
                bw.write(txt);
                bw.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        } else if (e.getActionCommand().equals("Load")){

            try{
                BufferedReader br = new BufferedReader(new FileReader("/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/save/save.txt"));

                String txt;
                ta.setText("");
                 while ((txt = br.readLine()) != null){
                    ta.append(txt+"\n");
                 }
                br.close();
                    
                } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }

        }
    }

