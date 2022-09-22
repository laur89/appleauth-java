package com.accedia.apple.auth.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@RequiredArgsConstructor
public class AppleAuthorizationToken {
    private final String authorisationCode;
    private final long expireInSeconds;
    private final String idToken;
    private final String refreshToken;
    private final UserData userData;
}
