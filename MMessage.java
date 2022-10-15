import javax.swing.JOptionPane; 
public class MMessage {
String sentto,sentby,mtext,mdate;
MMessage()
{
	sentto=sentby=mtext=mdate=" ";
}
MMessage(String t, String b,String m, String d )
{
	sentto=t;
	sentby=b;
	mtext=m;
	mdate=d;
	}
void display()
{
	JOptionPane.showMessageDialog(null, "The receiver is:  "+sentto+"\nThe sender is: "+sentby+"\nThe text is: "+mtext+"\nThe date is: "+mdate,"Information of Text",JOptionPane.PLAIN_MESSAGE);
}
void input()
{
sentto=JOptionPane.showInputDialog("Enter the receiver: ");	
sentby=JOptionPane.showInputDialog("Enter the sender: ");	
mtext=JOptionPane.showInputDialog("Enter the text: ");	
mdate=JOptionPane.showInputDialog("Enter the date: ");	
}

}

