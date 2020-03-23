public class Runner {
    public static void main(String[] args) {
        Planet earth = new Planet("earth", 6371);
        System.out.println(earth.getName());
        System.out.println(earth.getSize());
        System.out.println(earth.explode());

    }
}
