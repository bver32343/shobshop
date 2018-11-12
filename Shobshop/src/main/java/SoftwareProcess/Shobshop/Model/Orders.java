package SoftwareProcess.Shobshop.Model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity 
public class Orders {
    @NotNull
    private int orderId ;
    @NotNull
    private int quantity ;
    


}