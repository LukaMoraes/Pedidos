import java.util.Scanner;

public static class ConversorFoCo {
    int farenheit, celsius;

    public void constructorFo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os graus em farenheit que deseja converter:");

        this.farenheit = scanner.nextInt();
        this.celsius = (farenheit - 32)*5/9;
    }

    public void resultadoConversao(){
        System.out.println(farenheit+"ºF é igual a "+celsius+"ºC");
    }
}

public void main(String[] args) {

    ConversorFoCo conversor = new ConversorFoCo();

    conversor.constructorFo();
    conversor.resultadoConversao();

}