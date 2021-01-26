import adder.Adder;

public class Adderclass implements Adder {


    @Override
    public int add(int summand1, int summand2) throws Exception {
        if(summand1 > 0 && summand2 > 0) {
            if(Integer.MAX_VALUE - summand1 < summand2) {
                throw new Exception();
            }
        }
        if(summand1 < 0 && summand2 < 0) {
            if(Integer.MIN_VALUE - summand1 > summand2) {
                throw new Exception();
            }
        }

        return summand1 + summand2;
    }
}
