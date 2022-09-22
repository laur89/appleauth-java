package com.accedia.apple.auth.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.Instant;

@ToString
@Getter
@RequiredArgsConstructor
public class UserData {
    private final String email;
    private final Boolean verified;
    private final String subject;
    private final Instant authTime;
}
