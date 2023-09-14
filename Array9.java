//Transposed matrix
class matrixtransposed
  {
    public static void main(String arg[])
    {
      int original[][]={{1,3,4},{2,4,3},{3,4,5}};
      int transposed[][]=new int[3][3];
      for(int i=0;i<3;i++)
        {
          for(intj=0;i<3;j++)
            {
              transposed[i][j]=original[i][j];
            }
        }
      System.out.println("Print matrix without transposed :");
      for(int i=0;i<3;i++)
        {
          for{int j=0;j<3;j++)
            {
            System.out.println(original[i][j]+"");
          }
              System.out.println();
             }
          System.out.println("println matrix with  transpose");
          for(int i=0;i<3;i++)
            {
              for(int j=o;j<3;j++)
                {
                  System.out.println(transposed[i][j]+"");
                }
              System.out.println();
            }
        }
      
