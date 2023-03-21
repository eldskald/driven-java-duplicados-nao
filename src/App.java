public class App {
    public static void main(String[] args) throws Exception {
        String[] arr1 = new String[]{"Morango", "Uva", "Acerola", "Manga", "Teste"};
        String[] arr2 = new String[]{"Pêra", "Caju", "Morango", "Kiwi", "Teste"};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
