package JavaProject.gui_basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


//폼 디자인과 이벤트처리 입력을 위한 초기화면 - Event처리는 안함.
public class StudentGUIUI extends JFrame implements ActionListener ,FocusListener{
    private static final long serialVersionUID = 3983678104822158799L;
    private JLabel id_L, name_L, score_L;
    private JTextField id_T, name_T, score_T;
    private JTextArea output_T;
    private JButton regist_B, view_B, exit_B,modify_B;
    private JPanel side_P,input_P,south_P;
    private searchDialog mydialog;

    private updateDialog updateDialog;



    // 등록, 조회 등을 처리하는 StudentDAO 클래스 이용
    private StudentDAO dao;

    

    StudentGUIUI(){
        this.setTitle("학생관리프로그램");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.formDesign();
        this.eventHandler();
        this.setSize(530,230);
        this.setVisible(true);

        dao = new StudentDAO();
    }

    public void formDesign() {
        mydialog = new searchDialog();
        side_P = new JPanel();
        input_P = new JPanel();
        south_P = new JPanel();

        id_L = new JLabel("ID : ");
        name_L = new JLabel("이름 : ");
        score_L = new JLabel("성적 : ");

        id_T = new JTextField();
        name_T = new JTextField();
        score_T = new JTextField();

        output_T = new JTextArea("** 조회 화면 **");

        regist_B = new JButton("등록");
        view_B = new JButton("조회");
        exit_B = new JButton("종료");
        modify_B = new JButton("수정");



        this.add(side_P,BorderLayout.WEST);
        side_P.setLayout(new GridLayout(2,1));
        side_P.add(input_P);
        input_P.setLayout(new GridLayout(3,2));
        input_P.add(id_L);
        input_P.add(id_T);
        input_P.add(name_L);
        input_P.add(name_T);
        input_P.add(score_L);
        input_P.add(score_T);

        this.add(south_P,BorderLayout.SOUTH);
        south_P.add(regist_B);
        south_P.add(view_B);
        south_P.add(exit_B);
        south_P.add(modify_B);

        this.add(output_T,BorderLayout.CENTER);

        // 이벤트 처리가 되기전에
        name_T.setEditable(false);
        score_T.setEditable(false);

        // 종료버튼만 활성화
        regist_B.setEnabled(false);
        view_B.setEnabled(false);
        modify_B.setEnabled(false);
        




    }
    public void eventHandler() {
        // 등록 버튼 클릭
        regist_B.addActionListener(this);
        view_B.addActionListener(this);
        modify_B.addActionListener(this);
        exit_B.addActionListener(this);


        id_T.addFocusListener(this);
        name_T.addFocusListener(this);
        score_T.addFocusListener(this);




    }

    public static void main(String[] args) {
        new StudentGUIUI();


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("등록")) {
            if(dao.create(id_T.getText(), name_T.getText(),Integer.parseInt(score_T.getText())))
            {
                output_T.setText("등록이 되었습니다");
            }
            else {
                output_T.setText("같은 아이디가 존재합니다.");
            }
            id_T.setText("");
            name_T.setText("");
            score_T.setText("");
            view_B.setEnabled(true);
            modify_B.setEnabled(true);
            
        }else if(e.getActionCommand().equals("조회")) {
            output_T.setText(dao.read());
        }else if(e.getActionCommand().equals("수정")){
            mydialog.setVisible(true);
        }
        else {
            System.out.println("시스템종료");
            System.exit(0);
        }

    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource().equals(id_T))
            output_T.setText("ID를 입력해주세요" +'\n');
        else if (e.getSource().equals(name_T))
            output_T.setText("이름을 입력해주세요" +'\n');
        else if (e.getSource().equals(score_T))
            output_T.setText("성적을 입력해주세요" +'\n');


    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource().equals(id_T)) {
            if(id_T.getText()==" ")
                output_T.setText("ID가 없습니다.");
            else
                name_T.setEditable(true);
        }
        else if (e.getSource().equals(name_T)) {
            if(name_T.getText()==" ")
                output_T.setText("이름이 없습니다.");
            else
                score_T.setEditable(true);
        }
        else if (e.getSource().equals(score_T)) {
            if(score_T.getText()==" ")
                output_T.setText("성적이 없습니다.");
            else {
                regist_B.setEnabled(true);
                regist_B.requestFocus();
            }
        }

    }


    class searchDialog extends JDialog{


        private static final long serialVersionUID = -7844667783809073832L;
        private JTextField tf;
        private JPanel p1, p2, p3;
        private JLabel la;
        private JButton search_btn, update_btn;



        searchDialog() {
            this.setTitle("아이디 검색");
            this.formDesign();
            this.eventHandler();
            this.setSize(300, 200);
            this.setVisible(false);
        }

        public void formDesign() {
            tf = new JTextField(10);
            la = new JLabel("검색결과:");
            p1 = new JPanel();
            p2 = new JPanel();
            p3 = new JPanel();
            search_btn = new JButton("검색하기");
            update_btn = new JButton("수정하기");

            this.add(p1, BorderLayout.CENTER);
            p1.setLayout(new GridLayout(2, 1));
            p2.setLayout(new GridLayout(2, 1));
            p1.add(p2);
            p2.add(tf, BorderLayout.CENTER);
            p2.add(la, BorderLayout.CENTER);
            p1.add(p3);
            p3.add(search_btn);
            p3.add(update_btn);

            //검색결과 넘어오기 전까지 false
            update_btn.setEnabled(false);


        }

        public void eventHandler() {

            search_btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean result = dao.Search(tf.getText());
                    if (result == true) {
                        update_btn.setEnabled(true);
                        la.setText("검색결과 : 검색하신 ID ->"+ tf.getText() + "\t" + "가 존재.");
                    } else
                        la.setText("검색결과 : 검색하신 ID ->" + tf.getText() + "\t" + "가 존재하지 않음.");
                }
            });
            
            update_btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int id_i = dao.update(tf.getText());
                    Student st1 = dao.Search_i(id_i);
                    updateDialog = new updateDialog(st1.getId(),st1.getName(),st1.getScore());
                    updateDialog.setVisible(true);
                    mydialog.setVisible(false);
                }
            });

        }
    }

    class updateDialog extends JDialog{
        private static final long serialVersionUID = 8309207734155538748L;
        private JLabel Lid,Lname,Lscore,LTid;
        private JTextField Tname,Tscore;
        private JButton cancel,upBtn;
        private JPanel up1,up2,up3;


        updateDialog(String id_i,String name_i, int socre_i){
            this.setTitle("수정하기");
            this.setSize(450,300);
            this.formDesign(id_i, name_i,socre_i);
            this.eventHandler();
            this.setVisible(true);

        }
        public void formDesign(String id_i,String name_i, int socre_i){
            Lid = new JLabel("id:");
            Lname = new JLabel("name:");
            Lscore = new JLabel("score");
            LTid = new JLabel(id_i);
            Tname = new JTextField(name_i,10);
            Tscore = new JTextField(String.valueOf(socre_i),10);
            cancel = new JButton("취소");
            upBtn = new JButton("확인(수정)");
            up1 = new JPanel();
            up2 = new JPanel();
            up3 = new JPanel();

            this.add(up1,BorderLayout.CENTER);
            up1.setLayout(new GridLayout(2,1));
            up1.add(up2);
            up2.setLayout(new GridLayout(3,2));
            up2.add(Lid);
            up2.add(LTid);
            up2.add(Lname);
            up2.add(Tname);
            up2.add(Lscore);
            up2.add(Tscore);
            up1.add(up3);
            up3.setLayout(new GridLayout(1,2));
            up3.add(cancel);
            up3.add(upBtn);


        }
        public void eventHandler(){
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateDialog.setVisible(false);
                }
            });

            upBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int id_i = dao.update(LTid.getText());
                    String id = LTid.getText();
                    String name = Tname.getText();
                    int score = Integer.parseInt(Tscore.getText());
                    dao.update_2(id_i,id,name,score);
                    updateDialog.setVisible(false);
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    view_B.addActionListener(this);

                }
            });


        }

    }




    }