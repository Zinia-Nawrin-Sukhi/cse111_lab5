public class Teacher
{
 String name,dept,c;
 public Teacher(String n,String d){
  name=n;
  dept=d;
 }
     
    public void addCourse(Course c){
     c=c+"\n"+(Course ); 
      }
    t1.addCourse(c1);
    t1.addCourse(c2);
    t2.addCourse(c3);
    t2.addCourse(c4);
    t2.addCourse(c5);
    t3.addCourse(c6);
    t3.addCourse(c7);
    t3.addCourse(c8);
}
  t1.printDetail();
    t2.printDetail();
    t3.printDetail();

    public void printDetail(){
     System.out.print("======================");
      System.out.print("Name"+name+"\n"+"dept"+dept);
      System.out.print("======================");
      System.out.print("List of courses");
      System.out.print(c);
      System.out.print("======================");
      
      
    }

}