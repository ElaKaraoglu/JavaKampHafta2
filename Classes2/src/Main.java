
public class Main {

	public static void main(String[] args) {
		CustomerManager customermanager=new CustomerManager();
		CustomerManager customermanager2=new CustomerManager();
		customermanager=customermanager2;
        customermanager.Add();
        customermanager.Remove();
        customermanager.Update();
	}

}
