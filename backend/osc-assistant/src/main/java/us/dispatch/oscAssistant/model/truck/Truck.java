package us.dispatch.oscAssistant.model.truck;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Value;

@Entity(name = "truck")
@Table(name = "truck")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "truck_number", nullable = false, unique = true)
    private int truckNumber;

    @Column(name = "fleet_prefix", nullable = false)
    private String fleetPrefix;

    @Column(name = "truck_name", nullable = false)
    @Value("${truck.fleetPrefix + truck.truckNumber}")
    private String truckName;

    public Long getId() {
        return id;
    }

    public int getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(int truckNumber) {
        this.truckNumber = truckNumber;
    }

    public String getFleetPrefix() {
        return fleetPrefix;
    }

    public void setFleetPrefix(String fleetPrefix) {
        this.fleetPrefix = fleetPrefix;
    }

    public String getTruckName() {
        return truckName;
    }
}
