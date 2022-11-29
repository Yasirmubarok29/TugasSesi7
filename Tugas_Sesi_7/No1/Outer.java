package tugasSesi7;

// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069

public class Outer {
    int number = 0;
    
    private class Inner{
        public void print(){
            System.out.println("Mengakses inner class yang ke: " +(++number));
        }
    }
    
    void displayFromMethod(){
        Inner in = new Inner();
        in.print();
    }
    
}

class Main{
    public static void main(String[] args) {
        Outer out = new Outer();
        out.displayFromMethod();
        out.displayFromMethod();
    }
}