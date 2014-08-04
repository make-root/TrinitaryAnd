import java.awt.event.ActionListener;  
import java.awt.event.ActionEvent;
import javax.swing.JButton;
 
public class Engine implements ActionListener {
    
    GUI parent;//ССлка на гуи
    Engine (GUI parent){
        this.parent=parent;
    }
    
   public void actionPerformed(ActionEvent e){ 
       JButton clickedButton = (JButton) e.getSource();//источник действия

//       System.out.println("in engine");

       String FieldText1=parent.InputField1.getText();
       String FieldText2=parent.InputField2.getText();
       String FieldText3=parent.InputField3.getText();
       String FieldText4=parent.InputField4.getText();
       String FieldText5=parent.InputField5.getText();
       String FieldText6=parent.InputField6.getText();

//       System.out.println(FieldText1);
//       System.out.println(FieldText2);
//       System.out.println(FieldText3);
//       System.out.println(FieldText4);
//       System.out.println(FieldText5);
//       System.out.println(FieldText6);
       
       double Field1=0;
       double Field2=0;
       double Field3=0;
       double Field4=0;
       double Field5=0;
       double Field6=0;
       
       if (!"".equals(FieldText1)){
           Field1= (Double.parseDouble(FieldText1)/100);
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
           Field5= Double.parseDouble(FieldText5)/100;
        }
        if (!"".equals(FieldText6)){
           Field6= Double.parseDouble(FieldText6);
        }
        

        
        double Cell1=Field1*Field4;
        double Cell2=Field2*Field4;
        double Cell3=Field3*Field4;

        double Cell4=Field1*Field5;
        double Cell5=Field2*Field5;
        double Cell6=Field3*Field5;

        double Cell7=Field1*Field6;
        double Cell8=Field2*Field6;
        double Cell9=Field3*Field6;

        double Cell10=Cell1;
        double Cell11=Cell2+Cell4+Cell5;
        double Cell12=Cell3+Cell6+Cell7+Cell8+Cell9;

        parent.Label1.setText(Double.toString(Cell1));
        parent.Label2.setText(Double.toString(Cell2));
        parent.Label3.setText(Double.toString(Cell3));
        parent.Label4.setText(Double.toString(Cell4));
        parent.Label5.setText(Double.toString(Cell5));
        parent.Label6.setText(Double.toString(Cell6));
        parent.Label7.setText(Double.toString(Cell7));
        parent.Label8.setText(Double.toString(Cell8));
        parent.Label9.setText(Double.toString(Cell9));

        parent.Label10.setText(Double.toString(Cell10));
        parent.Label11.setText(Double.toString(Cell11));
        parent.Label12.setText(Double.toString(Cell12));
   } 
}