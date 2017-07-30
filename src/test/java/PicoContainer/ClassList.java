package PicoContainer;

import java.util.ArrayList;
import java.util.List;

import com.autopageclass.AddrPage;

import Pages.AddressPage;
import Pages.HomePage;
import Pages.OrderHistoryPage;
import Pages.loginPage;

public class ClassList {
	
 ArrayList<Person> myList = new ArrayList<Person>();{
 
 for(int ct = 0; ct<10; ct++){
	 Person per = new Person();
	 per.setLastName("John" + ct);
	 per.setFirstName("Doe" + ct);
	 myList.add(per);
 }
}

}
