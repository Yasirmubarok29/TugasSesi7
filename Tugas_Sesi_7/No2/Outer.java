package tugasSesi7.no2;

// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069

public class Outer {
    int  number = 0;
    
    void outerMethod(){
        class Inner{
            public void print(){
                System.out.println("Mengakses inner class yang ke: "+ (number++));
            }
        }
        Inner inner = new Inner();
        inner.print();
    }
    
}

class OuterAccess{
    public static void main(String[] args) {
        Outer outer = new Outer();
        
        outer.outerMethod();
        outer.outerMethod();
        outer.outerMethod();
    }
}