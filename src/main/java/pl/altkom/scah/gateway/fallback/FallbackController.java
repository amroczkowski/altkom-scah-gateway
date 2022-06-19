package pl.altkom.scah.gateway.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/reservationServiceFallback")
    public String getReservationServiceFallbackMethod() {
        return "Reservation service not responding. Please try again later.";
    }

    @GetMapping("/ownerServiceFallback")
    public String getOwnerServiceFallbackMethod() {
        return "Owner service not responding. Please try again later.";
    }

    @GetMapping("/dogServiceFallback")
    public String getDogServiceFallbackMethod() {
        return "Dog service not responding. Please try again later.";
    }
}
