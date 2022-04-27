package emailmore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Catalog {
	private ArrayList<Schools> schoolList;	
	
	public Catalog() {
		schoolList = new ArrayList<Schools>();
	}
	
	public void inputSchools() throws IOException, FileNotFoundException {
		Scanner inF = new Scanner(new File("schools.txt")); 
		String name;
		String address;
		while(inF.hasNextLine()){         
            name = inF.nextLine();
            address = inF.nextLine(); 
            
            Schools newSchool = new Schools(name, address);  
            schoolList.add(newSchool);
		}
	}

	public ArrayList<Schools> getSchoolList() {
		return schoolList;
	}

	public void setSchoolList(ArrayList<Schools> schoolList) {
		this.schoolList = schoolList;
	}
	
}
