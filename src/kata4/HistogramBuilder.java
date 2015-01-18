package kata4;

/**
 *
 * @author Krystian Kurzawa
 */
public class HistogramBuilder<E> {
    
    private E[] items;

    public HistogramBuilder(E[] items) {
        this.items = items;
    }
    
    public <A> Histogram<A> build(AttributeExtractor<E,A> extractor){
        Histogram<A> histogram = new Histogram<>();
        for (E item : items) {
            A attribute = extractor.extract(item);
            histogram.put(attribute, histogram.get(item) + 1);
        }
        return histogram;
    }   

}
