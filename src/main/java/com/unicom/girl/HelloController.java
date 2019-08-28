package com.unicom.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Copyright: Unicom (Zhejiang) Industrial Internet Co., Ltd.    2019 <br/>
 * @Desc: <br/>
 * @ProjectName: girl <br/>
 * @Date: 2019/8/27 15:42 <br/>
 * @Author: yangjiabin
 */
//@RestController    //等效于  @Controller  +   @ResponseBody
@Controller
@RequestMapping("/mygirl")
public class HelloController {


    @ResponseBody
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot";
    }


    //****************************************************************

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @ResponseBody
    @RequestMapping(value = "/hello2" ,method = RequestMethod.GET)
    public String say2(){
        return cupSize+"  "+age+"  ** "+content;
    }



    //****************************************************************

    @Autowired
    private GirlProperties girlProperties;

    @ResponseBody
    @RequestMapping(value = {"/hello3","/hi3"} ,method = RequestMethod.GET)
    public String say3(){
        return girlProperties.getCupSize()+"  "+girlProperties.getAge();
    }


    //****************************************************************


    @RequestMapping(value = "/hello4" ,method = RequestMethod.GET)
    public String say4(){
        return "index";
    }


    //****************************************************************


    @ResponseBody
    @RequestMapping(value = "/hello5/{id}/me" ,method = RequestMethod.GET)
    public String say5(@PathVariable("id") Integer id){
        return "id :"+id;
    }

    @ResponseBody
    @RequestMapping(value = "/hello6" ,method = RequestMethod.GET)
    public String say6(@RequestParam("myid") Integer id){
        return "id :" + id;
    }


    @ResponseBody
    //@RequestMapping(value = "/hello7" ,method = RequestMethod.GET)
    @GetMapping(value = "/hello7")
    public String say7(@RequestParam(value = "mygirl",required = false,defaultValue = "9923") Integer mygirl){
        return "mygirl :" + mygirl;
    }
}
