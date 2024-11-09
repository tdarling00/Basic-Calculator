public class Calculator {
    private long input1;
    private long input2;
    public Calculator (){
        input1 = 0;
        input2 = 0;
    }
    public void setInput(long integer1, long integer2) {
        input1 = integer1;
        input2 = integer2;
    }
    public long addition() {
        long sum = input1 + input2;
        return sum;
    }
    public long subtraction() {
        long diff = input1 - input2;
        return diff;
    }
    public long multiplication () {
        long product = input1 * input2;
        return product;
    }
    public float division() {
        float quotient = (float) input1 / input2;
        return quotient;
    }
}
