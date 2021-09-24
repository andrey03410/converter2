package temp.convert;

public class ConvertCelToFahrenheit implements TempConverter {
    @Override
    public double Convert(double val) {
        return 9.0 * val / 5.0 + 32;
    }
}
