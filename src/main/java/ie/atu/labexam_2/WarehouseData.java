package ie.atu.labexam_2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WarehouseData {
    public int warehouseId;
    public String location;
    public int capacity;
}
