package ie.atu.labexam_2;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class WarehouseService {
    private List<WarehouseData> warehouses = new ArrayList<>();
    public WarehouseData getWarehouseById(int id){
        if (warehouses.contains(id) == false){
            warehouses.add(new WarehouseData());
        }
        return warehouses.get(id);
    }
}
