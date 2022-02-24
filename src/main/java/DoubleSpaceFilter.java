public class DoubleSpaceFilter implements filter{
    @Override
    public boolean apply(String str) {
        String[] array = str.split("");
        for(int i=1; i< array.length;i++) {
            if(array[i].equals(array[i - 1]) && array[i].equals(" ")){
                return true;
            }
        }
        return false;

    }
}
