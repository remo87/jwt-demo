package org.remo.jwtdemo.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.remo.jwtdemo.user.Permission.*;

public enum Role {
    USER,
    ADMIN
}
