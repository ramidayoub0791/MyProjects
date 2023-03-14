package Exception;

public class LazyException extends Throwable {
    public LazyException(String lazyPersonFound) {
        super(lazyPersonFound);
    }
}
