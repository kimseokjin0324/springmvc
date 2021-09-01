package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController //RestController는 문자를 반환하면 그대로 반환이된다.(RestAPI를 만들때 핵심이됨) Controller는 뷰를 반환함
public class LogTestController {
//    private final Logger log= LoggerFactory.getLogger(getClass()); @Slf4j를 쓰면 롬복이 자동으로 등록을 해줌
    //private final Logger log= LoggerFactory.getLogger(LogTestController); 이렇게 써도됨

    @RequestMapping("/log-test")
    public String logTest(){

        String name="Spring";
        System.out.println("name = " + name);
        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info("info log={}",name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);
        return "ok";

    }
}
