public class TestComplexFactory {

    public static void main(String[] args){
        Complex complex = new ConcreteFactory().CreateComplex(5, 5);
        Complex complex1 = new Complex();
        complex1.setImage(-3);
        complex1.setReal(-3);
        System.out.println(complex);
        System.out.print(complex1);
    }
}