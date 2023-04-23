package class11;

public class E3D2Array {
    public static void main(String[] args) {

        String[][] names = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };
        for (String[] nameArr:names){
            System.out.println();
            for (String name:nameArr){
                System.out.print(name+" ");
            }
        }
    }
}
