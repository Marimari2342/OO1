package ar.edu.unlp.info.oo1.ej12_volumen;

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo reporte de construcción
        ReporteDeConstruccion reporte = new ReporteDeConstruccion();

        // Crear algunas piezas y agregarlas al reporte
        Esfera esfera1 = new Esfera(5, "Hierro", "Rojo");
        Esfera esfera2 = new Esfera(3, "Acero", "Rojo");
        Cilindro cilindro = new Cilindro(2, 3, "Hierro", "Azul");
        PrismaRectangular prisma = new PrismaRectangular(1,4,3,"Acero", "Rojo");

        // Agregar las piezas al reporte
        reporte.agregarPieza(esfera1);
        reporte.agregarPieza(esfera2);
        reporte.agregarPieza(cilindro);
        reporte.agregarPieza(prisma);
    
        // Calcular volumen total de material "Hierro"
        double volumenHierro = reporte.volumenDeMaterial("Hierro");
        System.out.println("Volumen de material 'Hierro': " + volumenHierro);

        // Calcular superficie total de color "Rojo"
        double superficieRojo = reporte.superficieDeColor("Rojo");
        System.out.println("Superficie de color 'Rojo': " + superficieRojo);
    }
}