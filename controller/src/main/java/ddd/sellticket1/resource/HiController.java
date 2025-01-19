package ddd.sellticket1.resource;

import ddd.sellticket1.service.event.EventApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.POST,value = "/hello")
public class HiController {
    @Autowired
    private EventApplicationService eventApplicationService;
    @GetMapping("/hi")
    public String hello(){
        return eventApplicationService.sayHi("dai");
    }
}
