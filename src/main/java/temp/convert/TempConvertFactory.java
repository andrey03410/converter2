package temp.convert;


import java.util.Locale;
import java.util.Objects;

public class TempConvertFactory {
    public TempConverter factory(Locale locale) {
        if (Objects.equals(locale.getLanguage(), "en")) {
            return new ConvertCelToFahrenheit();
        } else { // возвращаем кельвин во всех случаях кроме en
            return new ConvertCelToKelvin();
        }
    }
}
