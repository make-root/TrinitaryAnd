import javax.swing.*;
import java.awt.GridLayout;

public class GUI
{
    JPanel windowContent;

    JLabel LabelSpace1;
    JLabel LabelSpace2;
    JLabel LabelSpace3;
    JLabel LabelSpace4;
    JLabel LabelSpace5;
    JLabel LabelSpace6;
    JLabel LabelSpace7;
    JLabel LabelSpace8;
    JLabel LabelSpace9;
    JLabel LabelSpace10;

    JLabel LabelT1;
    JLabel LabelT2;
    JLabel LabelT3;
    JLabel LabelT4;
        
    JLabel LabelU1;
    JLabel LabelU2;
    JLabel LabelU3;
    JLabel LabelU4;
    JLabel LabelU5;
    JLabel LabelU6;
    JLabel LabelU7;
        
    JLabel LabelF1;
    JLabel LabelF2;
    JLabel LabelF3;
    JLabel LabelF4;
    JLabel LabelF5;
    JLabel LabelF6;
    JLabel LabelF7;
    JLabel LabelF8;

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
            
            // Создаём кнопки
            LabelSpace1 = new JLabel(" ");
            LabelSpace2 = new JLabel(" ");
            LabelSpace3 = new JLabel(" ");
            LabelSpace4 = new JLabel(" ");
            LabelSpace5 = new JLabel(" ");
            LabelSpace6 = new JLabel(" ");
            LabelSpace7 = new JLabel(" ");
            LabelSpace8 = new JLabel(" ");
            LabelSpace9 = new JLabel(" ");
            LabelSpace10 = new JLabel(" ");
       
        
            LabelT1 = new JLabel("T%");
            LabelT2 = new JLabel("T%");
            LabelT3 = new JLabel("T%");
            LabelT4 = new JLabel("T%");
            
            LabelU1 = new JLabel("U%");
            LabelU2 = new JLabel("U%");
            LabelU3 = new JLabel("U%");
            LabelU4 = new JLabel("U%");
            LabelU5 = new JLabel("U%");
            LabelU6 = new JLabel("U%");
            LabelU7 = new JLabel("U%");
        
            LabelF1 = new JLabel("F%");
            LabelF2 = new JLabel("F%");
            LabelF3 = new JLabel("F%");
            LabelF4 = new JLabel("F%");
            LabelF5 = new JLabel("F%");
            LabelF6 = new JLabel("F%");
            LabelF7 = new JLabel("F%");
            LabelF8 = new JLabel("F%");

            LabelTotal = new JLabel("Total:");
        
            InputField1 = new JTextField(3);    
            InputField2 = new JTextField(3);
            InputField3 = new JTextField(3);
            InputField4 = new JTextField(3);
            InputField5 = new JTextField(3);
            InputField6 = new JTextField(3);
        
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

            calculate = new JButton("AND");
            
 
            // Добавляем компоненты на панель 
            //1
            windowContent.add(LabelSpace1);//+
            windowContent.add(LabelSpace2);//+ 
            windowContent.add(LabelSpace3);//+
            windowContent.add(LabelT1);//+
            windowContent.add(LabelSpace4);//+
            windowContent.add(LabelU1);//+
            windowContent.add(LabelSpace5);//+
            windowContent.add(LabelF1);//+
      
            //2
            windowContent.add(LabelSpace6);//+
            windowContent.add(calculate);//+
            windowContent.add(LabelSpace7);//+
            windowContent.add(InputField1);//+
            windowContent.add(LabelSpace8);//+
            windowContent.add(InputField2);//+
            windowContent.add(LabelSpace9);//+
            windowContent.add(InputField3);//+
            //3
            windowContent.add(LabelT2);//+
            windowContent.add(InputField4);//+
            windowContent.add(LabelT3);//+
            windowContent.add(Label1);//+
            windowContent.add(LabelU2);//+
            windowContent.add(Label2);//+
            windowContent.add(LabelF2);//+
            windowContent.add(Label3);//+
            //4
            windowContent.add(LabelU3);//+
            windowContent.add(InputField5);//+
            windowContent.add(LabelU4);//+
            windowContent.add(Label4);//+
            windowContent.add(LabelU5);//+
            windowContent.add(Label5);//+
            windowContent.add(LabelF3);//+
            windowContent.add(Label6);//+
            //5
            windowContent.add(LabelF4);//+
            windowContent.add(InputField6);//+
            windowContent.add(LabelF5);//+
            windowContent.add(Label7);//+
            windowContent.add(LabelF6);//+
            windowContent.add(Label8);//+
            windowContent.add(LabelF7);//+
            windowContent.add(Label9);//+
            //6
            windowContent.add(LabelSpace10);//+
            windowContent.add(LabelTotal);//+
            windowContent.add(LabelT4);//+
            windowContent.add(Label10);//+
            windowContent.add(LabelU7);//+
            windowContent.add(Label11);//+
            windowContent.add(LabelF8);//+
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
