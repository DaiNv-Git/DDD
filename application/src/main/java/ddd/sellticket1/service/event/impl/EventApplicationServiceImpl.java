package ddd.sellticket1.service.event.impl;
import ddd.sellticket1.service.event.EventApplicationService;
import org.springframework.stereotype.Service;
@Service
public class EventApplicationServiceImpl implements EventApplicationService {
    @Override
    public String sayHi(String who) {
        return "hello application" + who;
    }
}
