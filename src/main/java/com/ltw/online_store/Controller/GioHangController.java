package com.ltw.online_store.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GioHangController {

    @GetMapping("/cart")
    public String cartPage(){
        return "web/cart";
    }
}
