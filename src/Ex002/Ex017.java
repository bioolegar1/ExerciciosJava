package Ex002;

import javax.swing.JOptionPane;

public class Ex017 {

    public static void main(String[] args) {
        //vers]ao minimia de java necessaria para aplicação

        int requiredMajorVersion = 17;

        // Obter a versão do java instalada
        String javaVersionString = System.getProperty("java.version");
        System.out.println("\nVersão do Java: " + javaVersionString);

        //tentar analizar versão principal

        int installedMajorVersion = 0;
        try{
            //analise simplificada de versão.

            if (javaVersionString.startsWith("1.")) {
                //para java 8 e anteriores
                installedMajorVersion = Integer.parseInt(javaVersionString.split("\\.")[1]);
            }else {
                //para javva 9 e posteriores
                installedMajorVersion = Integer.parseInt(javaVersionString.split("\\.")[0]);
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println(("Não foi possivel analizar a versão do java: " + e.getMessage()));
            //lidar com o errro e talvez assumir uma versao antiga ou apenas prosseguir
        }

        if (installedMajorVersion < requiredMajorVersion) {
            String message = "sua versão do Java isntalada (" + javaVersionString + ") é mais antiga que a versão necessaria (" + requiredMajorVersion + " ou superior).\n\n"+
                    "por favor, atualize seu Ambiente de Tempo de Execução Java para continuar rusando esta aplicação. \n\n"+
                    "Clique em 'OK' para abrir a pagina oficial de download do java em seu navegador.";
            int option = JOptionPane.showConfirmDialog(
                    null,
                    message,
                    "atualização do Java Necessária",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );

            if(option == JOptionPane.OK_OPTION) {
                try{
                    java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.java.com/download"));
                }catch (Exception e){
                    JOptionPane.showMessageDialog(
                            null,
                            "Não foi possivel abrir o navegador. Por favor, visite https://www.java.com/download/ manualmente para atualizar o Java.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }

            System.exit(1);
        }else {
            System.out.println("A versão do Java é compativel. Prosseguindo com a Aplicação...");
        }


        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        //  System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
        System.out.println("OS: " + System.getProperty("os.name"));

    }
}
