package adder;

public interface Adder {
    /**
     * addiert summand1 und summand2
     * @param summand1
     * @param summand2
     * @return Summe
     * @throws Exception wenn überlauf
     */
    int add(int summand1, int summand2) throws Exception;


}
