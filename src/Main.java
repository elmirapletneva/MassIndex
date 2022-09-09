public class Main {
    public static void main(String[] args) {
        int weight = 58;
        double height = 1.60;
        BmiService service = new BmiService();
        double bmi = service.calculate(weight, height);
        System.out.println(bmi + " Индекс массы тела");
    }
}
