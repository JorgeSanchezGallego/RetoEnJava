public class Reto2 {
    public static void main(String[] args) {
        /*Tu misión es simple, soldado: crear un calendario que muestre todos los meses
        del año y sus semanas de forma clara y organizada. Nada de efectos
        especiales ni complicaciones innecesarias, solo un buen
        código que haga el trabajo. Crea un programa que:

        Itere los meses del año
        Itere las semanas del mes
        PISTA: Bucle for anidado.
                Ejemplo
        Enero Semana 1 Semana 2 Semana 3 … */
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo" ,"Junio", "Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
                for (int i=0; i<meses.length; i++){
                    int semanas = 0;
                    if (i ==0 || i == 2 || i == 4 || i ==6 || i== 8 || i== 10){
                        semanas =4;
                        System.out.println("El mes " + meses[i] + " tiene " + semanas+ " semanas");
                    } else if (i ==1 || i==3 || i==5 || i==7 || i==9) {
                        semanas=3;
                        System.out.println("El mes " + meses[i] + " tiene " + semanas + " semanas");
                    } else {
                        semanas = 2;
                        System.out.println("El mes " + meses[i] + " tiene " + semanas + " semanas");
                    }
                }
    }
}
