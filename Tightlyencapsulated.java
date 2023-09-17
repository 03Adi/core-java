//tightly encapsulated class
class A
  {
    priavte int x=10;//tightly encapsulated
  }
class B extends A
  {
    int x=100;//not tightly encapsulated 
  }
class C extends A
  {
    private int x=110;//tightly encapsulated
  }
