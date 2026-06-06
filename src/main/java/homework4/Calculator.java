/*@author ნინო კვესელაძე*/

package homework4;

public class Calculator {public static void main(String[] args) {
    double a=70;
    double b=0;
    char op = '/';

    switch (op) {
        case '+':
            System.out.println("შედეგი არის " + (a+b));
            break;



        case '-':
            System.out.println("შედეგი არის " + (a-b));
            break;

        case '*':
            System.out.println("შედეგი არის " + (a*b));
            break;
        case '/':
            if (b==0) {
                System.out.println("ნულზე გაყოფა არ შეიძლება");
            }else {
                System.out.println("შედეგი არის " + (a / b));
            }
            break;

                default :
                    System.out.println("უცნობი ოპერატორი");



    }
}
}
