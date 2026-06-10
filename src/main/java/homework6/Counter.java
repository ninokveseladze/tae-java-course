
/*@Author - Nino Kveseladze*/

package homework6;

public class Counter {
    public int count;
     public    int maxValue;


    void increment (){
        if (count<maxValue){
            count+=1;
        }
    }
    void reset() {
        count = 0;
    }
    void countTo(int target) {
        for (int i = 1; i <= target; i++) {
            increment();
        }
    }

}
