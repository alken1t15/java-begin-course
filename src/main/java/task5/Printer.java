package task5;

public class Printer implements IPrinter {
    private int paintVolume;

    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    public Printer() {
    }

    @Override
    public String getPaintVolume() {
        return null;
    }

    public void setPaintVolume(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    @Override
    public void print(String text) {
        int temp = text.length() - paintVolume;
        String result;
        result = String.format("На печать отправлен текст: %s, длина: %d", text, text.length());
        System.out.println(result);
        //System.out.println("На печать отправлен текст: "+text+", длина: "+text.length());
        if (text.length() < paintVolume) {
            paintVolume -= text.length();
            result = String.format("Текст распечатан: %s, у принтера осталось краски: %d", text, paintVolume);
            System.out.println(result);
            //   System.out.println("Текст распечатан: "+text +", у принтера осталось краски: "+paintVolume);
        } else {
            result = String.format("Не хватило краски: %s всего краски в принтере %d", text, paintVolume);
            System.out.println(result);
            //   System.out.println("Не хватило краски: " + temp +" всего краски в принтере " + paintVolume);
        }
    }

    @Override
    public void charge(int count) {
        paintVolume += count;
        String result;
        result = String.format("Принтер пополнен на длину текста %d (всего краски в принтере: %d)", count, paintVolume);
        System.out.println(result);
        //    System.out.println("Принтер пополнен на длину текста "+count+" (всего краски в принтере: " + paintVolume+")");
    }
}