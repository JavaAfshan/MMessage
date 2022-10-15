import javax.swing.JOptionPane; 
public class MDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MMessage arr[]=new MMessage[10];
for(int i=0;i<2;i++)
{
	arr[i]=new MMessage();
	arr[i].input();
}
for(int i=0;i<2;i++)
{
	arr[i].display();
}
String choice,sender,word;
char choice1; boolean flag=false;
choice=new String(); 
do
{
choice=JOptionPane.showInputDialog(null,"Enter 1 for finding the sender\nEnter 2 for finding the word in text\nEnter 0 for exit","Menu",JOptionPane.PLAIN_MESSAGE);
choice1=choice.charAt(0);
if(choice1=='1')
{
	sender=JOptionPane.showInputDialog("Enter the name to find sender");
	for(int i=0;i<2;i++)
	{
		if(sender.compareToIgnoreCase(arr[i].sentby)==0)
		{
			arr[i].display();
		}
	}
}
else if(choice1=='2')
{

	word=JOptionPane.showInputDialog("Enter the word that you want to find from the string");
	for(int i=0;i<2;i++)
	{
		JOptionPane.showMessageDialog(null,arr[i].mtext.indexOf(word) );
		if(arr[i].mtext.indexOf(word)!=-1)
		{
			arr[i].display();
			flag=true;
		}
	}
	
	if(flag==false)
	{
		JOptionPane.showMessageDialog(null, "Not found");
		flag=false;
	}
}
}while(choice1!='0');

	}

}
