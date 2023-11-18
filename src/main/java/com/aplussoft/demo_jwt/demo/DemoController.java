package com.aplussoft.demo_jwt.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @GetMapping("/admin")
    public ResponseEntity<String> securedPlaceForAdmin(Principal principal) {
        return ResponseEntity.ok(principal.getName() + ", welcome to securedPlaceForAdmin");
    }

    @GetMapping("/staff")
    public ResponseEntity<String> securedPlaceForStaff(Principal principal) {
        return ResponseEntity.ok(principal.getName() + ", welcome to securedPlaceForStaff");
    }

    @GetMapping("/user")
    public ResponseEntity<String> securedPlaceForUser(Principal principal) {
        return ResponseEntity.ok(principal.getName() + ", welcome to securedPlaceForUser");
    }

    @GetMapping("/guest")
    public ResponseEntity<String> securedPlaceForGuest(Principal principal) {
        return ResponseEntity.ok(principal.getName() + ", welcome to securedPlaceForGuest");
    }


}
