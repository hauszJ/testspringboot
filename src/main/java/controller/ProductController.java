package controller;

import entity.CallBackResult;
import entity.Food;
import entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jac
 * @date 2018-07-31 15:59
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping(value="/list",method=RequestMethod.GET)
    public CallBackResult testGet(){
       CallBackResult cb= new CallBackResult();
       cb.setCode("0");
       cb.setMsg("成功");

        List<Product> data=new ArrayList<>();
        Food food=new Food("a1","meat","smell good","http://meat.com",2);
        data.add(new Product("热榜","1",food));
        cb.setData(data);
        return cb;
    }
}
