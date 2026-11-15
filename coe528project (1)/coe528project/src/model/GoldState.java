package model;

/**
 *
 * @author yusra
 */
public class GoldState implements CustomerState {
    
    @Override
    public String getStatusName() {
        return "Gold"; // Applies to customers with greater than or equal to 1000 points
    } 
}


