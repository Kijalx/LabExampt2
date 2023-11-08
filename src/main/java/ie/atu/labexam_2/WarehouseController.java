package ie.atu.labexam_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class WarehouseController {
    private WarehouseService warehouseService;
    private ProductInterface productInterface;

    public WarehouseController(WarehouseService warehouseService){
        this.warehouseService = warehouseService;
    }

    @GetMapping("/warehouseId")
    public WarehouseData getWarehouseById(@PathVariable int id){
        return warehouseService.getWarehouseById(id);
    }
}
