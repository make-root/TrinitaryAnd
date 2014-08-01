import java.awt.event.ActionListener;  
import java.awt.event.ActionEvent; 
//import javax.swing.JOptionPane;
import javax.swing.JButton;
 
public class Engine implements ActionListener {
    
    GUI parent;//ССілка на гуи
    Engine (GUI parent){
        this.parent=parent;
    }
    
   public void actionPerformed(ActionEvent e){ 
       JButton clickedButton = (JButton) e.getSource();//источник действия
       
       String FieldText1=parent.InputField1.getText();
       String FieldText2=parent.InputField2.getText();
       String FieldText3=parent.InputField3.getText();
       String FieldText4=parent.InputField4.getText();
       String FieldText5=parent.InputField5.getText();
       String FieldText6=parent.InputField6.getText();
       
       double Field1=0;
       double Field2=0;
       double Field3=0;
       double Field4=0;
       double Field5=0;
       double Field6=0;
       
       if (!"".equals(FieldText1)){
           Field1= Double.parseDouble(FieldText1);
        }
       if (!"".equals(FieldText2)){
           Field2= Double.parseDouble(FieldText2);
        }
        if (!"".equals(FieldText3)){
           Field3= Double.parseDouble(FieldText3);
        }
        if (!"".equals(FieldText4)){
           Field4= Double.parseDouble(FieldText4);
        }
        if (!"".equals(FieldText5)){
           Field5= Double.parseDouble(FieldText5);
        }
        if (!"".equals(FieldText6)){
           Field6= Double.parseDouble(FieldText6);
        }
        
        double Cell1;
        double Cell2;
        double Cell3;
        double Cell4;
        double Cell5;
        double Cell6;
        double Cell7;
        double Cell8;
        double Cell9;
        
        Cell1=Field1*Field4;
        Cell2=Field2*Field4;
        Cell3=Field3*Field4;
        
        Cell4=Field1*Field5;
        Cell5=Field2*Field5;
        Cell6=Field3*Field5;
        
        Cell7=Field1*Field6;
        Cell8=Field2*Field6;
        Cell9=Field3*Field6;
        
        //parent.Label1.setText(Cell1);
        
   } 
}