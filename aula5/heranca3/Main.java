public class Main{
    public static void main(String[] args){
        Paciente pac1 = new Paciente("Lucas", "Masculino", "10/06/2005");
        System.out.println("Paciente: " + pac1.getNome());
        System.out.println("Sexo: " + pac1.getSexo());
        System.out.println("Internacao: " + pac1.getData());
        System.out.println();
        Gerente ger1 = new Gerente("Regis", "Masculino", "10/05/2025", "2512890", "CRA2233");
        System.out.println("Gerente: " + ger1.getNome());
        System.out.println("Sexo: " + ger1.getSexo());
        System.out.println("Contratado(a): " + ger1.getData());
        ger1.liberarPagamento();
        System.out.println();
        Medico med1 = new Medico("Flavia", "Feminino", "10/06/2025", "2512990", "CRA22325");
        System.out.println("Gerente: " + ger1.getNome());
        System.out.println("Sexo: " + ger1.getSexo());
        System.out.println("Contratado(a): " + ger1.getData());
        med1.operar();
    }
}