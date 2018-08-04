public class PersonMain {

	public static void main(String[] args) 
	{
		Person person1=new Person("jaan", 5,6,1995);//initializing
		Person person2=new Person("Roger", 2,2,1998);//initializing
		person1.display();//display details
		person2.display();//display details
		person1.olderOne(person1, person2);// invoking older function
	}

}
