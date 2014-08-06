import javax.swing.*;
import java.awt.GridLayout;

public class GUI
{
    JPanel windowContent;

    final int LABEL_SPACES_NUM=10;
    final int LABEL_T_NUM=4;
    final int LABEL_U_NUM=7;
    final int LABEL_F_NUM=8;

    JLabel LabelTotal;

    JTextField InputField1;
    JTextField InputField2;
    JTextField InputField3;
    JTextField InputField4;
    JTextField InputField5;
    JTextField InputField6;

    JLabel Label1;
    JLabel Label2;
    JLabel Label3;
    JLabel Label4;
    JLabel Label5;
    JLabel Label6;
    JLabel Label7;
    JLabel Label8;
    JLabel Label9;
    JLabel Label10;
    JLabel Label11;
    JLabel Label12;

    JButton calculate;

    GUI()
        {
            windowContent= new JPanel();

            // Задаём менеджер отображения для этой панели

            GridLayout gl = new GridLayout(6,8);
            windowContent.setLayout(gl);

            // Создаём лейблы
            //пробелов
            JLabel[] LabelSpaces = new JLabel[LABEL_SPACES_NUM];
            for (int i=0;i<LABEL_SPACES_NUM;i++) {
                LabelSpaces[i]=new JLabel(" ");
            }

            //истины
            JLabel[] LabelTs = new JLabel[LABEL_T_NUM];
            for (int i=0;i<LABEL_T_NUM;i++) {
                LabelTs[i]=new JLabel("T%");
            }

            //неизвестности
            JLabel[] LabelUs = new JLabel[LABEL_U_NUM];
            for (int i=0;i<LABEL_U_NUM;i++) {
                LabelUs[i]=new JLabel("U%");
//                System.out.println("i["+i+"]="+LabelUs[i].getText());
            }

            //лжи
            JLabel[] LabelFs = new JLabel[LABEL_F_NUM];
            for (int i=0;i<LABEL_F_NUM;i++) {
                LabelFs[i]=new JLabel("F%");
            }


            Label1 = new JLabel(" ");
            Label2 = new JLabel(" ");
            Label3 = new JLabel(" ");
            Label4 = new JLabel(" ");
            Label5 = new JLabel(" ");
            Label6 = new JLabel(" ");
            Label7 = new JLabel(" ");
            Label8 = new JLabel(" ");
            Label9 = new JLabel(" ");
            Label10 = new JLabel(" ");
            Label11 = new JLabel(" ");
            Label12 = new JLabel(" ");

            LabelTotal = new JLabel("Total:");

            InputField1 = new JTextField(3);
            InputField2 = new JTextField(3);
            InputField3 = new JTextField(3);
            InputField4 = new JTextField(3);
            InputField5 = new JTextField(3);
            InputField6 = new JTextField(3);

            calculate = new JButton("AND");


            // Добавляем компоненты на панель
            //1
            windowContent.add(LabelSpaces[0]);
            windowContent.add(LabelSpaces[1]);
            windowContent.add(LabelSpaces[2]);
            windowContent.add(LabelTs[0]);
            windowContent.add(LabelSpaces[3]);
            windowContent.add(LabelUs[0]);
            windowContent.add(LabelSpaces[4]);
            windowContent.add(LabelFs[0]);

            //2
            windowContent.add(LabelSpaces[5]);
            windowContent.add(calculate);//+
            windowContent.add(LabelSpaces[6]);
            windowContent.add(InputField1);//+
            windowContent.add(LabelSpaces[7]);
            windowContent.add(InputField2);//+
            windowContent.add(LabelSpaces[8]);
            windowContent.add(InputField3);//+
            //3
            windowContent.add(LabelTs[1]);
            windowContent.add(InputField4);//+
            windowContent.add(LabelTs[2]);
            windowContent.add(Label1);//+
            windowContent.add(LabelUs[1]);
            windowContent.add(Label2);//+
            windowContent.add(LabelFs[1]);
            windowContent.add(Label3);//+
            //4
            windowContent.add(LabelUs[2]);
            windowContent.add(InputField5);//+
            windowContent.add(LabelUs[3]);
            windowContent.add(Label4);//+
            windowContent.add(LabelUs[4]);
            windowContent.add(Label5);//+
            windowContent.add(LabelFs[2]);
            windowContent.add(Label6);//+
            //5
            windowContent.add(LabelFs[3]);
            windowContent.add(InputField6);//+
            windowContent.add(LabelFs[4]);//+
            windowContent.add(Label7);//+
            windowContent.add(LabelFs[5]);//+
            windowContent.add(Label8);//+
            windowContent.add(LabelFs[6]);//+
            windowContent.add(Label9);//+
            //6
            windowContent.add(LabelSpaces[9]);
            windowContent.add(LabelTotal);//+
            windowContent.add(LabelTs[3]);
            windowContent.add(Label10);//+
            windowContent.add(LabelUs[6]);//+
            windowContent.add(Label11);//+
            windowContent.add(LabelFs[7]);//+
            windowContent.add(Label12);//+
  
    //регистрация слушателя
     Engine TAndEngine = new Engine(this);//создание класса движка
    //и передача ему ссылки на себя (класс ГУИ)
    calculate.addActionListener(TAndEngine);
      
     
    // Создаём фрейм и задаём для него панель
      JFrame frame = new JFrame("Trinitary AND"); 
      frame.setContentPane(windowContent); 
 
 
    // задаём и размер и делаем фрейм видимым
      //frame.setSize(500,200); 
      frame.pack();
      frame.setVisible(true); 
    }



}
