package programms;

import java.util.Scanner;
import oppsExaplanation.SBI;
public class AppExe {
	Scanner c = new Scanner(System.in);

	public static void main(String[] args) {
		AppExe e = new AppExe();
		e.www_fb_com();
	}

	public void www_fb_com() {
		System.out.println("welcome to log in page");
		loginPage();
	}

	boolean flag = true;
	int count = 0;

	private void loginPage() {
		while (flag) {
			System.out.println("enter user name");
			String UName = c.next();
			System.out.println("enter password");
			String Upass = c.next();
			System.out.println("click on logIn Button");
			if (UName.equals("A") & Upass.equals("c")) {
				homePage();
			} else {
				System.out.println("please Ented valid credentials");
				count++;
				if (count == 3) {
					System.out.println("blocked for 1 day");
					break;
				}
			}
		}
	}

	private void homePage() {
		System.out.println("Pfrofile Button          Summery button                 logOut");
		if (count < 3) {
			System.exit(3);
		}

	}

}
