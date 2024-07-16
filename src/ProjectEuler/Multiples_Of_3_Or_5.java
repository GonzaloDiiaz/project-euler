package ProjectEuler;

public class Multiples_Of_3_Or_5 {
    public static void ejercicio(){
        int variable = 0;
        for(int i = 0; i <= 1000 - 1; i++){
            if (i % 3 == 0 || i % 5 == 0){
                variable = variable + i;
            }
        }
        System.out.println(variable);
    }
}
