package Libraries;

public class InvalidSymbolNameException extends RuntimeException {
    public InvalidSymbolNameException(String s){
        System.out.println("Invalid Symbol Name. Cannot assign this name to a symbol: "+s);
    }
}
