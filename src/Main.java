#Simple Main Method
public class Main {
    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";

        
        return String.valueOf(number);
    }

    public  static void main(String args[])
    {
        Main obj= new Main();
        System.out.println(obj.play(5));
        System.out.println("FINISH")
        System.out.println("DONE")
    }
}
