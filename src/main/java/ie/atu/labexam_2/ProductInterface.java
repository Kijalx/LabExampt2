package ie.atu.labexam_2;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "product", url = "https://localhost:8080/")

public interface ProductInterface {
}
