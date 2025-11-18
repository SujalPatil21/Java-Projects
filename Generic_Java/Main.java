public class Main{

    public static void main(String[] args){

        Generic<Integer> num = new Generic<>();
        num.setValue(10);
        Generic<String> str = new Generic<>();
        str.setValue("Sujal");
        Generic<Double> dou = new Generic<>();
        dou.setValue(1.43);

        System.out.println("\n-----GENERIC JAVA-----");
        System.out.println("\nInterger Value : " + num.getValue());
        System.out.println("String Value : " + str.getValue());
        System.out.println("Double Value : " + dou.getValue());
    }
}