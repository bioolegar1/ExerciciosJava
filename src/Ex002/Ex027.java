package Ex002;

import java.io.Console;

//Inserir e exibir senha
public class Ex027 {
    public static void main(String[] args) {
        Console cons;

        //chek if the system console is available
        if ((cons = System.console()) != null) {
            char[] pass_ward = null;

            try{
                //prompt the user to imput their password
                pass_ward = cons.readPassword("Input your Password: ");

                System.out.println("Your password is: " + new String(pass_ward));
            }finally{
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }

            }
        }else {
            throw new RuntimeException("Can't get the password... No console");
        }

    }
}
