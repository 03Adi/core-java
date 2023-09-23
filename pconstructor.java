class emp
  {
    int eid;
    String(ename,cname);
    emp(int eid,String ename,String cname)
    {
      this.eid=eid;
      this.ename=ename;
      this.cname=cname;
    }
    void show()
    {
      System.out.prrintln(eid);
      System.out.println(ename);
      System.out.println(cname);
    }
    public static void main(String arg[])
    {
      emp e1=new emp(1,"Aditya","TCS");
      e1.show();
      emp e2=new emp(2,"charu","TCS");
      e2.show();
    }
  }
      
