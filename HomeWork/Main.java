public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		ReportManager rp = new ReportManager();
		rp.reportManager(user);
		SaveManager sm = new SaveManager();
		sm.saveManager(user);
	}
}