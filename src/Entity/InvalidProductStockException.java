package Entity;

public class InvalidProductStockException extends Exception{
    InvalidProductStockException(String message){
        super(message);
    }
}
