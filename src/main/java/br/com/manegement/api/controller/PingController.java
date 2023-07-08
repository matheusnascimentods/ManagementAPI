package br.com.manegement.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("ping")
public class PingController {

    @GetMapping @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public String ping() {
        return "Pong";
    }

}
