public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("📌 EJEMPLO 1: Verificación de edad para red social\n");

        int edad = 14;
        System.out.println("Edad: " + edad);

        if (edad >= 13) {
            System.out.println("✅ Puedes crear tu cuenta en la red social.");
        } else {
            System.out.println("❌ Aún no tienes la edad mínima.");
        }

        System.out.println("\nProbando con edad = 10:");
        edad = 10;
        System.out.println("Edad: " + edad);

        if (edad >= 13) {
            System.out.println("✅ Puedes crear tu cuenta en la red social.");
        } else {
            System.out.println("❌ Aún no tienes la edad mínima.");
        }
    }
}

public class Ejemplo2 {
    public static void main(String[] args) {
        System.out.println("📌 EJEMPLO 2: Sistema de calificaciones (if-else if-else)\n");

        int nota = 16;
        System.out.println("Nota: " + nota);

        if (nota >= 18) {
            System.out.println("📝 Excelente (A)");
        } else if (nota >= 14) {
            System.out.println("📝 Muy bien (B)");
        } else if (nota >= 11) {
            System.out.println("📝 Aprobado (C)");
        } else {
            System.out.println("📝 Desaprobado (D)");
        }

        System.out.println("\nProbando con diferentes notas:");

        int[] notas = {18, 13, 9};
        for (int n : notas) {
            System.out.print("Nota " + n + ": ");
            if (n >= 18) {
                System.out.println("Excelente (A)");
            } else if (n >= 14) {
                System.out.println("Muy bien (B)");
            } else if (n >= 11) {
                System.out.println("Aprobado (C)");
            } else {
                System.out.println("Desaprobado (D)");
            }
        }
    }
}

public class Ejemplo3 {
    public static void main(String[] args) {
        System.out.println("📌 EJEMPLO 3: Popularidad de publicación en redes sociales\n");

        int likes = 120;
        System.out.println("Likes: " + likes);

        if (likes >= 100) {
            System.out.println("🎉 ¡Tu publicación es popular!");
        } else {
            System.out.println("💪 Sigue compartiendo, ¡vas bien!");
        }

        System.out.println("\nProbando con likes = 40:");
        likes = 40;
        System.out.println("Likes: " + likes);

        if (likes >= 100) {
            System.out.println("🎉 ¡Tu publicación es popular!");
        } else {
            System.out.println("💪 Sigue compartiendo, ¡vas bien!");
        }
    }
}

public class Ejemplo4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Mensaje número " + i);
        }
    }
}

public class Ejemplo5 {
    public static void main(String[] args) {

        int likes = 0;

        while (likes < 3) {
            System.out.println("Aún tienes pocos likes: " + likes);
            likes++;
        }

        System.out.println("Llegaste a 3 likes, ¡bien!");
    }
}

public class Ejemplo6 {
    public static void main(String[] args) {

        int likes = 0;

        // Bucle while: simulamos que van llegando likes
        while (likes < 5) {
            System.out.println("Like recibido ❤️ Total: " + likes);
            likes++;
        }

        // if / else: decidir si es popular
        if (likes >= 5) {
            System.out.println("¡Tu publicación es popular! 🎉");
        } else {
            System.out.println("Sigue compartiendo para llegar a más personas.");
        }

        // Bucle for: mostrar estrellas según los likes
        System.out.println("Calificación:");
        for (int i = 1; i <= likes; i++) {
            System.out.print("⭐");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("   🎓 EJEMPLOS DE JAVA - ESTRUCTURAS DE CONTROL");
        System.out.println("═══════════════════════════════════════════════════════\n");

        // Ejecutar Ejemplo 1
        Ejemplo1.main(args);
        System.out.println("\n---------------------------------------------------\n");

        // Ejecutar Ejemplo 2
        Ejemplo2.main(args);
        System.out.println("\n---------------------------------------------------\n");

        // Ejecutar Ejemplo 3
        Ejemplo3.main(args);
        System.out.println("\n---------------------------------------------------\n");

        // Ejecutar Ejemplo 4
        Ejemplo4.main(args);
        System.out.println("\n---------------------------------------------------\n");

        // Ejecutar Ejemplo 5
        Ejemplo5.main(args);
        System.out.println("\n---------------------------------------------------\n");

        // Ejecutar Ejemplo 6
        Ejemplo6.main(args);
        
        System.out.println("\n═══════════════════════════════════════════════════════");
        System.out.println("   ✅ TODOS LOS EJEMPLOS EJECUTADOS CORRECTAMENTE");
        System.out.println("═══════════════════════════════════════════════════════");
    }
}
