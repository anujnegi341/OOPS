package abstraction;

public class DigitsOnlyFileReader extends AbstractFileReader {

    protected DigitsOnlyFileReader(String filePath) {
        super(filePath);
    }

    @Override
    protected String lineParsingAlgorithm(String line) {
        return line.replaceAll("[^0-9]", "");
    }
}
