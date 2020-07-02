package com.yh.jacoco.demo.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

/**
 * Created by emily on 20/4/29.
 */


@Controller
public class HomeController {


    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String home(Model model){

        return "index";
    }


    @RequestMapping(value ="/login", method = RequestMethod.GET)
    public String login(Model model){

        return "login";
    }


    @PostMapping("/ajax/getText.action")
    public void getText(String text,HttpServletResponse resp) throws IOException, JSONException {

        String mess = "gun";

        if(text.equals("111")){
            mess = "ok";
        }else{
            mess = "error";

        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("mess",mess);
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println(jsonObject.toString());
        resp.getWriter().close();

    }

}
