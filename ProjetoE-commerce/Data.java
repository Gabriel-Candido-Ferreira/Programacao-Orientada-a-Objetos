import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
  public static void main(String[] args) throws ParseException {
    Date data = new Date();

    System.out.println(data.toString());
    long time = data.getTime();

    //time = time + 10 * 24 * 60 * 60 * 1000;

    time = time +  10 * 60 * 60 * 1000;

    data.setTime(time);
    System.out.println(data.toString());
    



    Calendar calendario = Calendar.getInstance();
    System.out.println(calendario.get(Calendar.MONTH));
    System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
    System.out.println(calendario.get(Calendar.WEEK_OF_MONTH));

    calendario.add(Calendar.HOUR_OF_DAY, 350);
    calendario.set(Calendar.YEAR, 1950);


    System.out.println(calendario);
    System.out.println(calendario.getTime().getTime());

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String dataFormatada = formatter.format(calendario.getTime());
    String stringData = "25/12/2024";

    System.out.println(dataFormatada);

    Date dataParse = formatter.parse(stringData);
    calendario.setTime(dataParse);
    calendario.add(Calendar.DAY_OF_MONTH, 10);

    System.out.println(formatter.format(calendario.getTime()));

  }
}
