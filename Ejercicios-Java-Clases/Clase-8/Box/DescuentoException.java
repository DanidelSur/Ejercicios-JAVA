package Box;

public class DescuentoException extends Exception{
    // ? ATRIBUTOS
    private double Total;
    // ? CONSTRUCTOR

    public DescuentoException(double total) {
        Total = total;
    }
    // ? GETTER Y SETTER
    // ? MÉTODOS
    public void Error(){
        if (Total==0){
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!!\tHubo un problema con calcular los precios:\n!!\tEl precio total es: $"+Total+" (CERO)");
            System.out.println("!!\t<ERROR>\n!!\tNo se pueden leen los precios correctamente: Revise los datos");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }else if (Total<0){
            System.out.println("##########################################");
            System.out.println("Hubo un problema con calcular el Precio:\nEl Total da: $"+Total+" (NEGATIVO)");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nLa Suma y el Total de los Productos da Resultado Negativo.");
        }
    }
}
