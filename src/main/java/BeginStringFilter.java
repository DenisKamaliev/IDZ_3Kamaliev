public class BeginStringFilter implements filter{
    private String pattern;
    public BeginStringFilter(String pattern) throws NullPointerException{
        if(pattern == null || pattern.equals("")){
            throw new NullPointerException("Ошибка");
        }
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.indexOf(pattern) == 0;
    }
}
