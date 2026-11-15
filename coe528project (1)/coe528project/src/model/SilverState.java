package model;

/**
 *
 * @author yusra
 */
public class SilverState implements CustomerState {
    
    @Override
    public String getStatusName() {
        return "Silver"; // Applies to customers with less than 1000 points
    }      
}


