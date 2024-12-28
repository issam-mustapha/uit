package fizzbuzz;

public class FizzBuzz {
    public static String de(int nbre){
        String chaine;
        if(nbre%5==0 && nbre%3==0){
            chaine="FizzBuzz";
        }else if(nbre%5==0){
            chaine="Buzz";
        }else if(nbre%3==0){
            chaine="Fizz";
        }else {
            chaine=nbre+"";
        }
return chaine;


}
}
