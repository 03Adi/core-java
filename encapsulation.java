class student info
{
  int sid;
  String sname.city;
  void input(int si,String sname,String city)
  {
    sid=si;
    sname=sn;
    city=ci;
  }
  void show()
  {
    System.out.println(sid);
    System.out.println(sn);
    System.out.println(ci);
  }
  public static void main(String arg[])
  {
    student s1=new student();
    s1.input(1,"ram","sul");
    s1.show();

    student s2=new student();
    s1.input(2,"sita","sul");
    s1.show();
  }
}
