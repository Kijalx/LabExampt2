package ie.atu.labexam_2;

import java.util.ArrayList;
import java.util.List;

public class WarehouseService {
    private List<WarehouseData> warehouses = new ArrayList<>();
    public WarehouseData getWarehouseById(int id){
        return warehouses.get(id);
    }

}
