import java.util.Scanner;
public class Main
{
        public static void main(String[] args) {
                Scanner bernardo = new Scanner(System.in);
                System.out.println("Digite um número!");
                int n = bernardo.nextInt();
                int i = 0;
                while(i <= n){
                    if(i % 2 == 0){
                        System.out.println(i);
                    }
                    i++;
                }
        }
}