package deliveryhandler.backend.data;

import org.springframework.data.annotation.Id;

public class Package {

    @Id
    private String id;

    private final String pickupAddress;
    private final String deliveryAddress;

    private final Boolean delivered;

    public Package(String pickupAddress, String deliveryAddress, Boolean delivered){
        this.pickupAddress = pickupAddress;
        this.deliveryAddress = deliveryAddress;
        this.delivered = delivered;
    }

    public String getId() {
        return id;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Boolean getDelivered() {
        return delivered;
    }


}
