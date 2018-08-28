class Student66{
    int id;
    String name;
    Student66(int i,String n){
    id = i;
    name = n;
    }

    Student66(Student66 s){
    id = s.id;
    name =s.name;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
    Student66 s1 = new Student66(111,"Karan");
    Student66 s2 = new Student66(s1);
    s1.display();
    s2.display();
   }
}