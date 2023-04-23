package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name = "YanaWallace";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(" " + name.charAt(i));


            }
        System.out.println();
        int counter=0;
        for (int j = 0; j <name.length() ; j++) {
            if (name.charAt(j)=='a'){
                counter++;
            }

        }
        System.out.println("Sentence containes "+counter+" letters 'a'");

        }
    }

