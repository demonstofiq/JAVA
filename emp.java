package Lab3;

public class emp {
	class employee{
		static int eid;
		static String ename;
		static String companyname;
		
		static void setemployeedetail(int eid,String ename,String companyname) {
			 System.out.println("Employee ID: " + eid);
		        System.out.println("Employee Name: " + ename);
		        System.out.println("Company Name: " + companyname);
		}
		
		
	}

	public static void main(String[] args) {
		employee.setemployeedetail(234,"tofiq","Techcrop");
		System.out.println();
		employee.setemployeedetail(457,"SAFINA","JODHPUR LTD");
		
	}

}
