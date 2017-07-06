//InnerClassEx(내부 클래스 예제)
package day5;
public class ABC {
   public String msg = "A";
   public void print() {
      BC bc = new BC();
      bc.print();
   }
   public class BC {
      public String msg = "8";
      public void print() {
         C c = new C();
         c.print();
      }
      public class C {
         public String msg = "C";
         public void print() {
            System.out.println(msg);
            System.out.println(this.msg);
            System.out.println(C.this.msg);
            System.out.println(BC.this.msg);
            System.out.println(ABC.this.msg);
            
            //BC.aa () 사용 불가
         }
      }
   }

}