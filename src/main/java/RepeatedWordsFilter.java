public class RepeatedWordsFilter implements filter{
    @Override
    public boolean apply(String str) {
        str.toLowerCase();
        str.replaceAll(",", "");
        str.replaceAll(".", "");
        str.replaceAll(";", "");
        String[] array = str.split(" ");
        for(int i=0; i< array.length;i++) {
            for(int j = i + 1; j< array.length;j++){
                if(array[i].equals(array[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
