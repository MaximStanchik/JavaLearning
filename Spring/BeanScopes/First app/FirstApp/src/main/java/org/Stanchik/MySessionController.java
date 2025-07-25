package org.Stanchik;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class MySessionController {
    @Autowired
    private SessionBean sessionBean;

    @GetMapping("/session")
    public String handleSession() {
        sessionBean.display();
        return "Session Bean displayed";
    }
}
