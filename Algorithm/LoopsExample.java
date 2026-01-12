package Algorithm;

public class LoopsExample {

    public static void main(String[] args) {

        // 1️⃣ FOR LOOP
        System.out.println("FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println(); // space

        
        // 2️⃣ WHILE LOOP
        System.out.println("WHILE LOOP:");
        int a = 1;
        while (a <= 5) {
            System.out.println(a);
            a++;
        }

        System.out.println(); // space

        
        // 3️⃣ DO-WHILE LOOP
        System.out.println("DO-WHILE LOOP:");
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 5);

        System.out.println(); // space

        
        // 4️⃣ FOR-EACH LOOP (ARRAY)
        System.out.println("FOR-EACH LOOP:");
        int[] numbers = {5, 10, 15, 20};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

