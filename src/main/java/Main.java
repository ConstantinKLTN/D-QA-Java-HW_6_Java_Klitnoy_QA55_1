import ru.nerology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println(service.calcNumbers(10, 9801));
    }
}
