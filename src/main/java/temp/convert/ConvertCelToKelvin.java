package temp.convert;

public class ConvertCelToKelvin implements TempConverter {
    @Override
    public double Convert(double val) {
        return val + 273.15;
    }
}
