package br.com.grupoacert.test;

public class SimpleArtifactApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        greet("this is a sample");
    }
    
    public static void greet(String name) {
        if(! name.isEmpty()) {
            System.out.println("print-it: "+name);
        }
    }

}
