package cn.tkl.dockTkl.controller;
import cn.tkl.dockTkl.service.TaoKouLingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wpj
 * @since 2020/10/9
 */
@CrossOrigin
@RestController
public class TaoKouLingController {
    @Autowired
    private TaoKouLingService taoKouLingService;

    @PostMapping("/operation")
    public String operation(String content) {
        return taoKouLingService.operation(content);
    }
}
