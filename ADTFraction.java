          System.out.println( "//////////Checking default contructor//////////");         ADTFraction t = new ADTFraction();          t.display();         System.out.println( t.value());                  System.out.println( "////////// Checking overloaded contructor////////");               ADTFraction t2 = new ADTFraction(4,2);          t2.display();         System.out.println( t2.value());                  System.out.println( "////////////Checking set function////////////////");           ADTFraction t3 = new ADTFraction();          t3.set(4, 2);         t3.display();         System.out.println( t3.value());                  System.out.println( "////////////Checking plus function//////////////////");         ADTFraction t4 = new ADTFraction(4,2);         ADTFraction t5 = new ADTFraction(6,3);         ADTFraction t6 = t4.plus(t5);         t6.display();         System.out.println(t6.value());                  System.out.println( "////////////Checking timess function////////////////");          ADTFraction t7 = new ADTFraction(4,2);          ADTFraction t8 = t7.times(3);          t8.display();          System.out.println(t8.value());                  System.out.println( "////////////Checking timess function////////////////");          ADTFraction t9 = new ADTFraction(4,2);          ADTFraction t10 = new ADTFraction(6,3);          ADTFraction t11 = t10.times(t9);          t11.display();          System.out.println(t11.value());                    System.out.println( "////////////Checking reciprocal function/////////////"); 
         ADTFraction t12 = new ADTFraction(4,2);          ADTFraction t13 = t12.reciprocal();          t13.display();          System.out.println(t13.value());     }      } 
 
class ADTFraction{     private int n;  //numerator     private int d;  //denomenator     //---------------------------------------------------     public ADTFraction (){//default constructor  //fill the body         this.n=0;         this.d=1;     }     //--------------------------------------------------     public ADTFraction (int a, int b){//parameter constructor           if(b!=0)         {          this.n=a;          this.d=b;         }         else             System.out.print("Denomenator can not be zero");     }     //---------------------------------------------------     public void set (int a, int b){//set numerator and denomenator  if(b!=0)         {          this.n=a;          this.d=b;         }         else             System.out.print("Denomenator can not be zero");     }     //-------------------