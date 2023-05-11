package Casting;

public class Casting {
    public static void main(String[] args) {
        
        // Conversione da int a double
        int a = 5;
        double b = (double) a;
        System.out.println("a = " + a + ", b = " + b);
        
        // Conversione da double a int
        double c = 5.7;
        int d = (int) c;
        System.out.println("c = " + c + ", d = " + d);
        
        // Conversione da char a int
        char e = 'A';
        int f = (int) e;
        System.out.println("e = " + e + ", f = " + f);
        
        // Conversione da int a char
        int g = 66;
        char h = (char) g;
        System.out.println("g = " + g + ", h = " + h);
        
        // Conversione da boolean a String
        boolean i = true;
        String j = Boolean.toString(i);
        System.out.println("i = " + i + ", j = " + j);
        
        // Conversione da String a boolean
        String k = "true";
        boolean l = Boolean.parseBoolean(k);
        System.out.println("k = " + k + ", l = " + l);
        
        // Conversione da int a String
        int m = 123;
        String n = Integer.toString(m);
        System.out.println("m = " + m + ", n = " + n);
        
        // Conversione da String a int
        String o = "456";
        int p = Integer.parseInt(o);
        System.out.println("o = " + o + ", p = " + p);
        
        // Conversione da double a String
        double q = 3.14;
        String r = Double.toString(q);
        System.out.println("q = " + q + ", r = " + r);
        
        // Conversione da String a double
        String s = "2.718";
        double t = Double.parseDouble(s);
        System.out.println("s = " + s + ", t = " + t);
    }
}
