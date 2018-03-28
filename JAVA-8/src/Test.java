import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

     
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Starts: List of object is : ");
	 List<Integer> list = new ArrayList<>();
	 for (int i = 0; i <10; i++) {
		 list.add(i*2-3*4+2*3);
		
	   }
	   System.out.println(list);
	   List<Integer> list2 = new ArrayList<>();
	   List<Integer> list3 = new ArrayList<>();
	   /*for (Integer integer : list) {
		   if(integer > 0)
			   list2.add(integer);
		   else{
			   list3.add(integer);
		   }*/
		  
	
	   List<Integer> list4 = list.stream().filter(L->L>0).collect(Collectors.toList());  
	   List<Integer> list5 = list.stream().filter(L->L<0).collect(Collectors.toList());
	    System.out.println("positive No");
		System.out.println(list4);
		System.out.println("Negative No");
		System.out.println(list5);
		
	}
}

		
		/*Student s1 = new Student(2,"Pk","BE");
		Student s2 = new Student(2,"Pk","BE");
		Student s3 = new Student(2,"Pk","BE");
		Student s4 = s3;
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.getMarks(45, 59));
		
		
		
		String[] s ={"JAVA"};
		String s1 ="JAVA";
		 char[] c = s1.toCharArray();
		 System.out.println(c.getClass().getName());
		System.out.println(s[0]==s1);
	}
}
	class Student{
		int id;
		String name;
		String course;
		
		public Student(int id, String name, String course) {
			
			this.id = id;
			this.name = name;
			this.course = course;
		}
		public double getMarks(int firstTerm, int secondTerm){
			int result = firstTerm * firstTerm;
			return result;
		}
		
		
	}*/


